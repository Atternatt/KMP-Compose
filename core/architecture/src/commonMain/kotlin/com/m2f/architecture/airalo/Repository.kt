package com.mobillium.airalo.architecture.airalo

import com.mobillium.airalo.architecture.failure.Failure
import com.mobillium.airalo.architecture.query.Delete
import com.mobillium.airalo.architecture.query.Get
import com.mobillium.airalo.architecture.query.KeyQuery
import com.mobillium.airalo.architecture.query.Put
import com.mobillium.airalo.architecture.repository.MainSyncRepository
import com.mobillium.airalo.architecture.repository.Repository
import com.mobillium.airalo.architecture.repository.SingleDataSourceRepository
import com.mobillium.airalo.architecture.repository.StoreSyncRepository

/**
 * Airalo typealias are just for convenience. They use [Failure] as the default error type.
 */
typealias AiraloRepository<Q, A> = Repository<Failure, Q, A>
typealias AiraloKeyRepository<Q, A> = Repository<Failure, KeyQuery<Q, A>, A>
typealias AiraloGetRepository<Q, A> = Repository<Failure, Get<Q>, A>
typealias AiraloDeleteRepository<K> = Repository<Failure, Delete<K>, Unit>
typealias AiraloPutRepository<Q, A> = Repository<Failure, Put<Q, A>, A>