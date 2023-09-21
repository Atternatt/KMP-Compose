package com.m2f.model

data class CountryPackage(
  val id: Int,
  val data: String,
  val validity: String,
  val price: Double,
  val operator: Operator
)