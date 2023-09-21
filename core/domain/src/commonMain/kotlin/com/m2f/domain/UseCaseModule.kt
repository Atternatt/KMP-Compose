package com.m2f.domain

import com.m2f.network.NetworkModule
import com.mobillium.airalo.architecture.repository.toRepository

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
    override val getPackageList: GetPackageListUseCase by lazy { getPackageListUseCase(repository = networkPackageListDataSource.toRepository()) }

}