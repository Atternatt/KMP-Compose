package com.m2f.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImageEntity(
  @SerialName("url")
  val url: String
)