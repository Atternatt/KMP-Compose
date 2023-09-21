package com.mobillium.airalo.architecture.datasource

import com.mobillium.airalo.architecture.airalo.AiraloDataSource
import com.mobillium.airalo.architecture.query.KeyQuery

/**
 * StorageDataSource is a [DataSource] that uses [KeyQuery] as the query type.
 *
 * This is intended to represent a data source that handles Get and Put Queries. The usual use case
 * is to implement a single data source that performs both operations.
 *
 * A clear example could be [InMemoryDataSource] that stores data in memory and can be used for both
 * Get and Put operations.
 *
 * This kind of data source is very useful to handle caching.
 */
interface StorageDataSource<K, A>: AiraloDataSource<KeyQuery<K,out A>, A>