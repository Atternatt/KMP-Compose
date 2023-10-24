package com.mobillium.airalo.architecture.datasource

import arrow.core.Either
import com.mobillium.airalo.architecture.query.Get
import com.mobillium.airalo.architecture.query.KeyQuery
import com.mobillium.airalo.architecture.query.Put

/**
 * A data source is a component that provides data to the application.
 * It can be a remote API, a local database, or a cache.
 *
 * @param F The type of the Failure that the data source can return.
 * @param Q The type of the query that the data source needs to run.
 * @param A The type of the result that the data source returns.
 */
fun interface DataSource<out F, in Q, out A> {
    /**
     * Runs the data source with the given query.
     *
     * @param q The query that the data source needs to run.
     * @return The result of the data source.
     *
     * Either is a branched type that can be Left<F> or Right<A>.
     * Normally, the Left side is used for errors and the Right side is used for success.
     */
    suspend operator fun invoke(q: Q): Either<F, A>
}

typealias StoreDataSource<F, K, A> = DataSource<F, KeyQuery<K, out A>, A>
typealias GetDataSource<F, K, A> = DataSource<F, Get<K>, A>
typealias PutDataSource<F, K, A> = DataSource<F, Put<K, A>, A>