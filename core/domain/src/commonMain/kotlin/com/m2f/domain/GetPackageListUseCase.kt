package com.m2f.domain

import arrow.core.Either
import com.m2f.model.CountryPackage
import com.mobillium.airalo.architecture.airalo.AiraloGetRepository
import com.mobillium.airalo.architecture.failure.Failure
import com.mobillium.airalo.architecture.repository.get

/**
 * GetPackageListUseCase is a use case that retrieves a list of [CountryPackage] from a repository.
 */
interface GetPackageListUseCase {
    suspend operator fun invoke(slug: String): Either<Failure, List<CountryPackage>>
}

internal fun getPackageListUseCase(repository: AiraloGetRepository<String, List<CountryPackage>>) =
    object : GetPackageListUseCase {
        override suspend fun invoke(slug: String): Either<Failure, List<CountryPackage>> =
            repository.get(slug)
    }