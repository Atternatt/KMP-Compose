package com.mobillium.airalo.architecture.airalo.operation

sealed interface Operation

object MainOperation : Operation
object StoreOperation : Operation
object MainSyncOperation : Operation
object StoreSyncOperation : Operation