package org.company.app.utils

actual object DecimalFormat {
    actual fun format(double: Double): String = double.toString()
}