package com.mobillium.airalo.architecture.airalo

import com.mobillium.airalo.architecture.airalo.operation.MainSyncOperation
import com.mobillium.airalo.architecture.datasource.StorageDataSource
import com.mobillium.airalo.architecture.failure.Failure
import com.mobillium.airalo.architecture.query.Get
import com.mobillium.airalo.architecture.repository.RepositoryFactory
import com.mobillium.airalo.architecture.repository.cacheFactory

/**
 * Airalo typealias are just for convenience. They use [Failure] as the default error type.
 */
typealias AiraloRepositoryFactory<Q, A> = RepositoryFactory<Failure, Q, A>

/**
 * This factory works on top of [cacheFactory] and uses [Failure] as the default error type for all
 * the stack of the elements it uses.
 *
 * @param mainDataSource The main data source that will be used to fetch data (it only supports Get Queries)
 * @param storeDataSource The store data source that will be used to fetch data. (it supports Get | Put | Delete Queries)
 * @param mainFallback The fallback list that will be used when the main data source fails.
 * @param storeFallback The fallback list that will be used when the store data source fails.
 */
fun <K, Q : Get<K>, A> airaloCacheFactory(
    mainDataSource: AiraloDataSource<Q, A>,
    storeDataSource: AiraloStoreDataSource<K, A>,
    mainFallback: List<Failure> = mainAiraloFallbacks,
    storeFallback: List<Failure> = storageAiraloFallbacks
): AiraloRepositoryFactory<Q, A> = cacheFactory(
    mainDataSource = mainDataSource,
    storeDataSource = storeDataSource,
    mainFallback = mainFallback,
    storeFallback = storeFallback
)

infix fun <K, Q : Get<K>, A> AiraloDataSource<Q, A>.fallbackWith(store: StorageDataSource<K, A>): AiraloRepository<Q, A> =
    airaloCacheFactory(this, store).create(MainSyncOperation)