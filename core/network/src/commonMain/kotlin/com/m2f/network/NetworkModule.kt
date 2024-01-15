package com.m2f.network

import com.m2f.archer.crud.GetDataSource
import com.m2f.model.CountryPackage
import com.m2f.network.datasource.NetworkPackageListDataSource

interface NetworkModule {
    val networkPackageListDataSource: GetDataSource<String, List<CountryPackage>>

    companion object {
        operator fun invoke(): NetworkModule = DefaultNetworkModule()
    }
}

internal class DefaultNetworkModule : NetworkModule {

    override val networkPackageListDataSource: GetDataSource<String, List<CountryPackage>> by lazy { NetworkPackageListDataSource(NetworkComponent()) }
}
