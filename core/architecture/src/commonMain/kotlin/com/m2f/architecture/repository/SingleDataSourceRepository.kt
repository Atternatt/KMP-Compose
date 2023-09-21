package com.mobillium.airalo.architecture.repository

import arrow.core.Either
import com.mobillium.airalo.architecture.datasource.DataSource
import com.mobillium.airalo.architecture.datasource.DeleteDataSource

class SingleDataSourceRepository<F, in Q, out A>(
    private val dataSource: DataSource<F, Q, A>
): Repository<F,Q,A> {
    override suspend fun invoke(q: Q): Either<F, A> = dataSource(q)
}

fun <F, Q, A> DataSource<F, Q, A>.toRepository(): Repository<F, Q, A> =
    SingleDataSourceRepository(this)

fun <F, Q> DeleteDataSource<F, Q>.toDataSource(): DataSource<F, Q, Unit> = DataSource { q ->
    delete(q)
}

fun <F, Q> DeleteDataSource<F, Q>.toDeleteRepository(): Repository<F, Q, Unit> =
    toDataSource().toRepository()