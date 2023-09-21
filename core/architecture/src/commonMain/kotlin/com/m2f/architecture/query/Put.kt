package com.mobillium.airalo.architecture.query

import arrow.core.Option

class Put<K, A>(key: K, val value: Option<A>): KeyQuery<K, A>(key)