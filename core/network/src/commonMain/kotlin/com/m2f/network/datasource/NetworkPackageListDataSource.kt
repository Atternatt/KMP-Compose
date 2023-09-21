package com.m2f.network.datasource

import arrow.core.Either
import com.m2f.model.CountryPackage
import com.m2f.network.NetworkComponent
import com.m2f.network.model.CountryPackagesNetworkEntity
import com.m2f.network.model.mappers.toCountyPackage
import com.mobillium.airalo.architecture.airalo.AiraloGetDataSource
import com.mobillium.airalo.architecture.failure.DataNotFound
import com.mobillium.airalo.architecture.failure.Failure
import com.mobillium.airalo.architecture.query.Get
import io.ktor.client.call.body
import io.ktor.client.request.get

interface NetworkPackageListDataSource: AiraloGetDataSource<String, List<CountryPackage>> {
    companion object {
        internal operator fun invoke(networkComponent: NetworkComponent): NetworkPackageListDataSource = object : NetworkPackageListDataSource {
            override suspend fun invoke(q: Get<String>): Either<Failure, List<CountryPackage>> =
                Either.catch {
                    with(networkComponent.apiNetworkConfiguration) {
                        val response = httpClient.get("${baseUrl}countries/${q.key}").body<CountryPackagesNetworkEntity>()
                        response.packages.map { it.toCountyPackage() }
                    }
                }.mapLeft { DataNotFound }
        }
    }
}

