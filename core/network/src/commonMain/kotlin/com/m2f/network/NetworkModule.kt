package com.m2f.network

import com.m2f.model.CountryPackage
import com.m2f.network.datasource.NetworkPackageListDataSource
import com.mobillium.airalo.architecture.airalo.AiraloGetDataSource

interface NetworkModule {
    val networkPackageListDataSource: AiraloGetDataSource<String, List<CountryPackage>>

    companion object {
        operator fun invoke(): NetworkModule = DefaultNetworkModule()
    }
}

internal class DefaultNetworkModule : NetworkModule {

    override val networkPackageListDataSource: AiraloGetDataSource<String, List<CountryPackage>> by lazy { NetworkPackageListDataSource(NetworkComponent()) }
}
