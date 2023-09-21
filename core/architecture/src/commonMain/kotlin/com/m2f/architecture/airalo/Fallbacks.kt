package com.mobillium.airalo.architecture.airalo

import com.mobillium.airalo.architecture.failure.DataNotFound
import com.mobillium.airalo.architecture.failure.Failure
import com.mobillium.airalo.architecture.failure.NoConnection
import com.mobillium.airalo.architecture.failure.ServerFailure

/**
 * Failures that will be used for network calls to fallback into storage
 */
internal val mainAiraloFallbacks: List<Failure> = listOf(
    NoConnection,
    ServerFailure
)

/**
 * Failures that will be used for storage calls to fallback into network
 */
internal val storageAiraloFallbacks: List<Failure> = listOf(
    DataNotFound
)

