package com.m2f.domain

import com.m2f.archer.crud.cache.CacheExpiration.After
import com.m2f.archer.crud.cache.cache
import com.m2f.archer.crud.operation.StoreSyncOperation
import com.m2f.network.NetworkModule
import kotlin.time.Duration.Companion.minutes

interface UseCaseModule {
    val getPackageList: GetPackageListUseCase

    companion object {
        suspend operator fun invoke(context: suspend UseCaseModule.() -> Unit) = context(DefaultUseCaseModule())
        fun getInstance(): UseCaseModule = DefaultUseCaseModule()
    }
}

internal class DefaultUseCaseModule(
    private val networkModule: NetworkModule = NetworkModule()
) : UseCaseModule, NetworkModule by networkModule {
    override val getPackageList: GetPackageListUseCase by lazy {
        getPackageListUseCase(
            repository = networkPackageListDataSource.cache(
                expiration = After(5.minutes)
            ).create(StoreSyncOperation)
        )
    }
}