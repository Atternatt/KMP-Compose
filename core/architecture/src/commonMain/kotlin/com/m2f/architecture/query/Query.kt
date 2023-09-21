package com.mobillium.airalo.architecture.query

sealed interface Query<A>

/**
 * A query that exposes a Key, normally used to identify a resource.
 */
sealed class KeyQuery<K,A>(val key: K): Query<A>