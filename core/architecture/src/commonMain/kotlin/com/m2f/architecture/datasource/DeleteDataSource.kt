package com.mobillium.airalo.architecture.datasource

import arrow.core.Either

fun interface DeleteDataSource<out F, in Q> {
    suspend fun delete(q: Q): Either<F, Unit>
}
