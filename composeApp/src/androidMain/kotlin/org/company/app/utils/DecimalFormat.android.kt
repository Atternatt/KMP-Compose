package org.company.app.utils

import android.icu.text.DecimalFormat

actual object DecimalFormat {
    actual fun format(double: Double) : String {
        return DecimalFormat("#.##").format(double)
    }
}