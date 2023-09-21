package org.company.app.utils

import androidx.compose.ui.graphics.Color

fun hexStringToLong(hexString: String): Long {
    val formattedString = hexString.removePrefix("#")
    val alphaString = "FF"
    val hexWithAlpha = alphaString + formattedString
    return hexWithAlpha.toLong(16)
}

fun String.toColor(): Color = Color(hexStringToLong(this))