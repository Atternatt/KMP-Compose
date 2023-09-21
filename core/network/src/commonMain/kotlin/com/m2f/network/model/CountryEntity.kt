package com.m2f.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CountryEntity(
  @SerialName("slug")
  val slug: String,
  @SerialName("title")
  val title: String,
  @SerialName("image")
  val image: ImageEntity
)