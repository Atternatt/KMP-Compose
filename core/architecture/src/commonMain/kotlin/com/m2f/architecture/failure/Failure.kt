package com.mobillium.airalo.architecture.failure

sealed interface Failure

/** Data can't be found */
object DataNotFound : Failure

/** Data is empty */
object DataEmpty : Failure

sealed interface NetworkFailure: Failure
/**No connection*/
object NoConnection : NetworkFailure

/**Server Error*/
object ServerFailure : NetworkFailure

object Redirect : NetworkFailure

object Unauthorised : NetworkFailure

/**Network Error with an optional message*/
data class NetworkError(val message: Message? = null) : NetworkFailure

object UnhandledNetworkFailure : NetworkFailure

data class Unknown(val exception: Throwable) : Failure