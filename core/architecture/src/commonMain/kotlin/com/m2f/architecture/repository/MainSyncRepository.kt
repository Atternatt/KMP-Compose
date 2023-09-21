package com.mobillium.airalo.architecture.repository

import arrow.core.Either
import arrow.core.Some
import arrow.core.flatMap
import arrow.core.handleErrorWith
import com.mobillium.airalo.architecture.datasource.DataSource
import com.mobillium.airalo.architecture.datasource.StoreDataSource
import com.mobillium.airalo.architecture.query.Get
import com.mobillium.airalo.architecture.query.Put

class MainSyncRepository<F, K, Q : Get<K>, A>(
    private val mainDataSource: DataSource<F, Q, A>,
    private val storeDataSource: StoreDataSource<F, K, A>,
    private val fallbackChecks: List<F> = emptyList()
) : Repository<F, Q, A> {

    override suspend fun invoke(q: Q): Either<F, A> =
        mainDataSource(q)
            .flatMap { storeDataSource(Put(q.key, Some(it))) }
            .handleErrorWith { f ->
                if (f in fallbackChecks) {
                    storeDataSource(q)
                        .mapLeft { f }
                } else {
                    Either.Left(f)
                }
            }
}
