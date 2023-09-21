package com.mobillium.airalo.architecture.mapper

/**
 * A bijection represents a two way mapping from S to T and from T to S
 */
interface Bijection<S, T> {

    fun from(s: S): T
    fun to(t: T): S
}