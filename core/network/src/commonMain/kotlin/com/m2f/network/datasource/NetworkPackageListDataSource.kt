package com.m2f.network.datasource

import arrow.core.Either
import arrow.core.raise.catch
import com.m2f.archer.crud.GetDataSource
import com.m2f.archer.crud.getDataSource
import com.m2f.archer.failure.DataNotFound
import com.m2f.archer.failure.Failure
import com.m2f.archer.mapper.map
import com.m2f.archer.query.Get
import com.m2f.model.CountryPackage
import com.m2f.network.NetworkComponent
import com.m2f.network.model.CountryPackagesNetworkEntity
import com.m2f.network.model.mappers.toCountyPackage
import io.ktor.client.call.*
import io.ktor.client.request.*

interface NetworkPackageListDataSource : GetDataSource<String, List<CountryPackage>> {
    companion object {
        internal operator fun invoke(networkComponent: NetworkComponent): GetDataSource<String, List<CountryPackage>> =
            getDataSource<String, CountryPackagesNetworkEntity> {
                with(networkComponent.apiNetworkConfiguration) {
                    catch({
                        httpClient.get("${baseUrl}countries/${it}").body<CountryPackagesNetworkEntity>()
                    }) {
                        raise(DataNotFound)
                    }

                }
            }.map { it.packages.map { it.toCountyPackage() } }
    }
}


