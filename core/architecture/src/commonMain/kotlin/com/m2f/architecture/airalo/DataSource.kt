package com.mobillium.airalo.architecture.airalo

import arrow.core.Either
import arrow.core.None
import arrow.core.some
import com.mobillium.airalo.architecture.datasource.DataSource
import com.mobillium.airalo.architecture.datasource.DeleteDataSource
import com.mobillium.airalo.architecture.datasource.GetDataSource
import com.mobillium.airalo.architecture.datasource.PutDataSource
import com.mobillium.airalo.architecture.datasource.StoreDataSource
import com.mobillium.airalo.architecture.failure.Failure
import com.mobillium.airalo.architecture.query.Delete

/**
 * Airalo typealias are just for convenience. They use [Failure] as the default error type.
 */
typealias AiraloDataSource<Q, A> = DataSource<Failure, Q, A>
typealias AiraloGetDataSource<K, A> = GetDataSource<Failure, K, A>
typealias AiraloPutDataSource<K, A> = PutDataSource<Failure, K, A>
typealias AiraloStoreDataSource<K, A> = StoreDataSource<Failure, K, A>
typealias AiraloDeleteDataSource<K> = DeleteDataSource<Failure, Delete<K>>