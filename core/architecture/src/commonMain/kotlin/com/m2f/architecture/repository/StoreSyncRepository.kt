package com.mobillium.airalo.architecture.repository

import arrow.core.Either
import arrow.core.handleErrorWith
import com.mobillium.airalo.architecture.datasource.DataSource
import com.mobillium.airalo.architecture.datasource.StoreDataSource
import com.mobillium.airalo.architecture.query.Get

class StoreSyncRepository<F, K, Q : Get<K>, A>(
    private val storeDataSource: StoreDataSource<F, K, A>,
    private val mainDataSource: DataSource<F, Q, A>,
    private val fallbackChecks: List<F> = emptyList(),
    private val mainFallbackChecks: List<F> = emptyList()
) : Repository<F, Q, A> {

    override suspend fun invoke(q: Q): Either<F, A> =
        storeDataSource(q)
            .handleErrorWith { f ->
                if (f in fallbackChecks) {
                    MainSyncRepository(
                        mainDataSource,
                        storeDataSource,
                        mainFallbackChecks
                    )(q)
                } else {
                    Either.Left(f)
                }
            }

}