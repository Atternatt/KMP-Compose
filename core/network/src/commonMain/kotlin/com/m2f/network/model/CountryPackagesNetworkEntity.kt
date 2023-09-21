package com.m2f.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CountryPackagesNetworkEntity(
  @SerialName("packages")
  val packages: List<CountryPackageEntity>
)