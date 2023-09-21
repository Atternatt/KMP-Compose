package com.m2f.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OperatorEntity(
  @SerialName("title")
  val title: String,
  @SerialName("image")
  val logo: ImageEntity,
  @SerialName("gradient_start")
  val gradientStartColorHex: String,
  @SerialName("gradient_end")
  val gradientEndColorHex: String,
  @SerialName("style")
  val style: String,
  @SerialName("countries")
  val countries: List<CountryEntity>,
)