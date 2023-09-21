package com.m2f.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CountryPackageEntity(
  @SerialName("id")
  val id: Int,
  @SerialName("data")
  val data: String,
  @SerialName("validity")
  val validity: String,
  @SerialName("price")
  val price: Double,
  @SerialName("operator")
  val operator: OperatorEntity
)