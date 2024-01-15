package com.m2f.domain

import arrow.core.Either
import com.m2f.archer.crud.GetRepository
import com.m2f.archer.crud.get
import com.m2f.archer.failure.Failure
import com.m2f.model.CountryPackage

/**
 * GetPackageListUseCase is a use case that retrieves a list of [CountryPackage] from a repository.
 */
interface GetPackageListUseCase {
    suspend operator fun invoke(slug: String): Either<Failure, List<CountryPackage>>
}

internal fun getPackageListUseCase(repository: GetRepository<String, List<CountryPackage>>) =
    object : GetPackageListUseCase {
        override suspend fun invoke(slug: String): Either<Failure, List<CountryPackage>> =
            repository.get(slug)
    }