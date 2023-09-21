package com.m2f.model


data class Operator(
  val title: String,
  val logo: Image,
  val gradientStartColorHex: String,
  val gradientEndColorHex: String,
  val style: String,
  val countries: List<Country>,
) {
  fun style(): Style = Style.fromString(style)
}

sealed class Style {
  object Light : Style()
  object Dark : Style()

  companion object {
    fun fromString(value: String): Style {
      return when (value) {
        "light" -> Light
        "dark" -> Dark
        else -> throw IllegalArgumentException("Unknown style $value")
      }
    }
  }
}