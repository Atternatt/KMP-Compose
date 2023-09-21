package com.mobillium.airalo.architecture.repository

import com.mobillium.airalo.architecture.airalo.operation.MainOperation
import com.mobillium.airalo.architecture.airalo.operation.MainSyncOperation
import com.mobillium.airalo.architecture.airalo.operation.Operation
import com.mobillium.airalo.architecture.airalo.operation.StoreOperation
import com.mobillium.airalo.architecture.airalo.operation.StoreSyncOperation
import com.mobillium.airalo.architecture.datasource.DataSource
import com.mobillium.airalo.architecture.datasource.StoreDataSource
import com.mobillium.airalo.architecture.query.Get

fun interface RepositoryFactory<out F, in Q, out A> {
    fun create(operation: Operation): Repository<F, Q, A>
}

/**
 * Creates a [RepositoryFactory] that uses the given [mainDataSource] and [storeDataSource] to
 * create [Repository] instances.
 * The main idea is to provides a caching system with fallback.
 *
 * @param mainDataSource The main data source that will be used to fetch data (it only supports Get Queries)
 * @param storeDataSource The store data source that will be used to fetch data. (it supports Get | Put | Delete Queries)
 * @param mainFallback The fallback list that will be used when the main data source fails.
 * @param storeFallback The fallback list that will be used when the store data source fails.
 *
 */
fun <F, K, Q : Get<K>, A> cacheFactory(
    mainDataSource: DataSource<F, Q, A>,
    storeDataSource: StoreDataSource<F, K, A>,
    mainFallback: List<F> = emptyList(),
    storeFallback: List<F> = emptyList()
): RepositoryFactory<F,Q,A> = RepositoryFactory { operation ->
    when (operation) {
        is MainOperation -> mainDataSource.toRepository()
        is StoreOperation -> storeDataSource.toRepository()
        is MainSyncOperation -> MainSyncRepository(mainDataSource, storeDataSource, mainFallback)
        is StoreSyncOperation -> StoreSyncRepository(
            storeDataSource,
            mainDataSource,
            storeFallback,
            mainFallback
        )
    }

}