package org.company.app.utils

expect object DecimalFormat {
    fun format(double: Double): String
}
