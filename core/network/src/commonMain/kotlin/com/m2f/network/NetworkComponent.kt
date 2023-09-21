package com.m2f.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpSend
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.plugin
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json


interface NetworkComponent {
  val apiNetworkConfiguration: NetworkConfiguration

  companion object {
    operator fun invoke(): NetworkComponent = NetworkDefaultModule()
  }
}

class NetworkDefaultModule : NetworkComponent {

  private val json: Json by lazy {
    Json {
      ignoreUnknownKeys = true
      useAlternativeNames = false
    }
  }

  private val httpClient by lazy {
    HttpClient {
      install(ContentNegotiation) {
        json(json = json)
      }
      install(HttpTimeout) {
        connectTimeoutMillis = 10_000
        requestTimeoutMillis = 10_000
        socketTimeoutMillis = 10_000
      }
    }.also {
      it.plugin(HttpSend).intercept { request ->
        request.headers.append("Accept-Language", "en")
        execute(request)
      }
    }
  }

  override val apiNetworkConfiguration: NetworkConfiguration by lazy {
    NetworkConfiguration(
      httpClient,
      "https://www.airalo.com/api/v2/",
      json,
    )
  }
}


data class NetworkConfiguration(
  val httpClient: HttpClient,
  val baseUrl: String,
  val json: Json,
)
