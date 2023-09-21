package com.mobillium.airalo.architecture.repository

import arrow.core.Either
import arrow.core.some
import com.mobillium.airalo.architecture.airalo.AiraloDeleteRepository
import com.mobillium.airalo.architecture.airalo.AiraloGetRepository
import com.mobillium.airalo.architecture.airalo.AiraloPutRepository
import com.mobillium.airalo.architecture.failure.Failure
import com.mobillium.airalo.architecture.query.Delete
import com.mobillium.airalo.architecture.query.Get
import com.mobillium.airalo.architecture.query.Put

sealed interface Repository<out F, in Q, out A> {
    suspend operator fun invoke(q: Q): Either<F, A>
}

suspend inline fun <reified K, reified A> AiraloGetRepository<K, A>.get(param: K): Either<Failure, A> =
    invoke(Get(param))

suspend inline fun <reified K, reified A> AiraloPutRepository<K, A>.put(
    param: K,
    value: A
): Either<Failure, A> = invoke(
    Put(param, value.some())
)

suspend inline fun <reified K, reified A> AiraloPutRepository<K, A>.put(param: K): Either<Failure, A> =
    invoke(
        Put(param, arrow.core.None)
    )

suspend inline fun <reified K> AiraloDeleteRepository<K>.delete(param: K): Either<Failure, Unit> =
    invoke(Delete(param))