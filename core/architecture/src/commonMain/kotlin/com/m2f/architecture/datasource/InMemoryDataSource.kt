package com.mobillium.airalo.architecture.datasource

import arrow.core.Either
import arrow.core.continuations.EffectScope
import arrow.core.continuations.either
import com.mobillium.airalo.architecture.airalo.AiraloDeleteDataSource
import com.mobillium.airalo.architecture.failure.DataNotFound
import com.mobillium.airalo.architecture.failure.Failure
import com.mobillium.airalo.architecture.query.Delete
import com.mobillium.airalo.architecture.query.Get
import com.mobillium.airalo.architecture.query.KeyQuery
import com.mobillium.airalo.architecture.query.Put

/**
 * A data source that stores data in memory.
 *
 * @param K The type of the key that the data source uses to store data.
 * @param A The type of the data that the data source stores.
 */
class InMemoryDataSource<K, A>(initialValues: Map<K, A> = emptyMap()) :
    StorageDataSource<K, A>, AiraloDeleteDataSource<K> {

    private val values: MutableMap<K, A> by lazy { initialValues.toMutableMap() }

    override suspend fun invoke(q: KeyQuery<K, out A>): Either<Failure,A> = either {
        when (q) {
            is Put -> {
                //bind is a suspend function that returns the value of the effect
                //the enclosing lambda shifts the effect to a default failure if the value can't be found
                q.value.bind { DataNotFound }
                    .also { values[q.key] = it }
            }

            is Get -> {
                values[q.key] ?: shift(DataNotFound)
            }
        }
    }

    override suspend fun delete(q: Delete<K>): Either<Failure, Unit> = either {
        values.remove(q.key) ?: shift(DataNotFound)
    }
}