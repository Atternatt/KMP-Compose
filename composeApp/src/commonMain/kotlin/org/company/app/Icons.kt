package org.company.app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

//https://www.composables.com/icons
@Composable
fun rememberLightMode(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "light_mode",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 25.625f)
                quadToRelative(2.333f, 0f, 3.979f, -1.646f)
                reflectiveQuadTo(25.625f, 20f)
                quadToRelative(0f, -2.333f, -1.646f, -3.979f)
                reflectiveQuadTo(20f, 14.375f)
                quadToRelative(-2.333f, 0f, -3.979f, 1.646f)
                reflectiveQuadTo(14.375f, 20f)
                quadToRelative(0f, 2.333f, 1.646f, 3.979f)
                reflectiveQuadTo(20f, 25.625f)
                close()
                moveToRelative(0f, 2.625f)
                quadToRelative(-3.417f, 0f, -5.833f, -2.417f)
                quadTo(11.75f, 23.417f, 11.75f, 20f)
                quadToRelative(0f, -3.417f, 2.417f, -5.854f)
                quadToRelative(2.416f, -2.438f, 5.833f, -2.438f)
                quadToRelative(3.417f, 0f, 5.854f, 2.438f)
                quadToRelative(2.438f, 2.437f, 2.438f, 5.854f)
                quadToRelative(0f, 3.417f, -2.438f, 5.833f)
                quadTo(23.417f, 28.25f, 20f, 28.25f)
                close()
                moveTo(3.042f, 21.292f)
                quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                reflectiveQuadTo(1.75f, 20f)
                quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                quadToRelative(0.375f, -0.395f, 0.917f, -0.395f)
                horizontalLineToRelative(3.916f)
                quadToRelative(0.542f, 0f, 0.938f, 0.395f)
                quadToRelative(0.396f, 0.396f, 0.396f, 0.938f)
                quadToRelative(0f, 0.542f, -0.396f, 0.917f)
                reflectiveQuadToRelative(-0.938f, 0.375f)
                close()
                moveToRelative(30f, 0f)
                quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                reflectiveQuadTo(31.75f, 20f)
                quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                quadToRelative(0.375f, -0.395f, 0.917f, -0.395f)
                horizontalLineToRelative(3.916f)
                quadToRelative(0.542f, 0f, 0.938f, 0.395f)
                quadToRelative(0.396f, 0.396f, 0.396f, 0.938f)
                quadToRelative(0f, 0.542f, -0.396f, 0.917f)
                reflectiveQuadToRelative(-0.938f, 0.375f)
                close()
                moveTo(20f, 8.25f)
                quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                reflectiveQuadToRelative(-0.375f, -0.917f)
                verticalLineTo(3.042f)
                quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                quadToRelative(0.375f, -0.396f, 0.917f, -0.396f)
                reflectiveQuadToRelative(0.938f, 0.396f)
                quadToRelative(0.395f, 0.396f, 0.395f, 0.938f)
                verticalLineToRelative(3.916f)
                quadToRelative(0f, 0.542f, -0.395f, 0.917f)
                quadToRelative(-0.396f, 0.375f, -0.938f, 0.375f)
                close()
                moveToRelative(0f, 30f)
                quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                reflectiveQuadToRelative(-0.375f, -0.917f)
                verticalLineToRelative(-3.916f)
                quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                quadToRelative(0.375f, -0.396f, 0.917f, -0.396f)
                reflectiveQuadToRelative(0.938f, 0.396f)
                quadToRelative(0.395f, 0.396f, 0.395f, 0.938f)
                verticalLineToRelative(3.916f)
                quadToRelative(0f, 0.542f, -0.395f, 0.917f)
                quadToRelative(-0.396f, 0.375f, -0.938f, 0.375f)
                close()
                moveTo(9.875f, 11.708f)
                lineTo(7.667f, 9.542f)
                quadToRelative(-0.417f, -0.375f, -0.396f, -0.917f)
                quadToRelative(0.021f, -0.542f, 0.396f, -0.958f)
                quadToRelative(0.416f, -0.375f, 0.958f, -0.396f)
                quadToRelative(0.542f, -0.021f, 0.917f, 0.396f)
                lineToRelative(2.166f, 2.166f)
                quadToRelative(0.375f, 0.417f, 0.375f, 0.938f)
                quadToRelative(0f, 0.521f, -0.375f, 0.937f)
                quadToRelative(-0.375f, 0.375f, -0.916f, 0.355f)
                quadToRelative(-0.542f, -0.021f, -0.917f, -0.355f)
                close()
                moveToRelative(20.583f, 20.625f)
                lineToRelative(-2.166f, -2.208f)
                quadToRelative(-0.334f, -0.375f, -0.354f, -0.917f)
                quadToRelative(-0.021f, -0.541f, 0.395f, -0.916f)
                quadToRelative(0.334f, -0.417f, 0.875f, -0.396f)
                quadToRelative(0.542f, 0.021f, 0.959f, 0.396f)
                lineToRelative(2.166f, 2.166f)
                quadToRelative(0.417f, 0.375f, 0.396f, 0.917f)
                quadToRelative(-0.021f, 0.542f, -0.396f, 0.958f)
                quadToRelative(-0.416f, 0.375f, -0.958f, 0.396f)
                quadToRelative(-0.542f, 0.021f, -0.917f, -0.396f)
                close()
                moveToRelative(-2.166f, -20.625f)
                quadToRelative(-0.417f, -0.375f, -0.396f, -0.916f)
                quadToRelative(0.021f, -0.542f, 0.396f, -0.959f)
                lineToRelative(2.166f, -2.166f)
                quadToRelative(0.375f, -0.417f, 0.917f, -0.396f)
                quadToRelative(0.542f, 0.021f, 0.958f, 0.396f)
                quadToRelative(0.375f, 0.416f, 0.396f, 0.958f)
                quadToRelative(0.021f, 0.542f, -0.396f, 0.917f)
                lineToRelative(-2.166f, 2.166f)
                quadToRelative(-0.375f, 0.375f, -0.917f, 0.375f)
                reflectiveQuadToRelative(-0.958f, -0.375f)
                close()
                moveTo(7.667f, 32.333f)
                quadToRelative(-0.375f, -0.416f, -0.396f, -0.958f)
                quadToRelative(-0.021f, -0.542f, 0.396f, -0.917f)
                lineToRelative(2.208f, -2.166f)
                quadToRelative(0.375f, -0.375f, 0.917f, -0.375f)
                quadToRelative(0.541f, 0f, 0.916f, 0.375f)
                quadToRelative(0.417f, 0.375f, 0.396f, 0.916f)
                quadToRelative(-0.021f, 0.542f, -0.396f, 0.917f)
                lineToRelative(-2.166f, 2.208f)
                quadToRelative(-0.375f, 0.417f, -0.917f, 0.396f)
                quadToRelative(-0.542f, -0.021f, -0.958f, -0.396f)
                close()
                moveTo(20f, 20f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberDarkMode(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "dark_mode",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 34.917f)
                quadToRelative(-6.208f, 0f, -10.562f, -4.355f)
                quadTo(5.083f, 26.208f, 5.083f, 20f)
                quadToRelative(0f, -5.542f, 3.417f, -9.583f)
                quadToRelative(3.417f, -4.042f, 8.833f, -5.042f)
                quadToRelative(1.584f, -0.292f, 2.125f, 0.604f)
                quadToRelative(0.542f, 0.896f, -0.166f, 2.438f)
                quadToRelative(-0.417f, 0.958f, -0.625f, 1.979f)
                quadToRelative(-0.209f, 1.021f, -0.209f, 2.104f)
                quadToRelative(0f, 3.792f, 2.625f, 6.417f)
                reflectiveQuadToRelative(6.417f, 2.625f)
                quadToRelative(1.083f, 0f, 2.083f, -0.209f)
                quadToRelative(1f, -0.208f, 1.959f, -0.583f)
                quadToRelative(1.708f, -0.708f, 2.541f, -0.104f)
                quadToRelative(0.834f, 0.604f, 0.5f, 2.271f)
                quadToRelative(-0.958f, 5.125f, -4.979f, 8.562f)
                quadToRelative(-4.021f, 3.438f, -9.604f, 3.438f)
                close()
                moveToRelative(0f, -2.625f)
                quadToRelative(4.25f, 0f, 7.521f, -2.604f)
                quadToRelative(3.271f, -2.605f, 4.271f, -6.271f)
                quadToRelative(-1f, 0.375f, -2.104f, 0.583f)
                quadToRelative(-1.105f, 0.208f, -2.188f, 0.208f)
                quadToRelative(-4.875f, 0f, -8.292f, -3.416f)
                quadToRelative(-3.416f, -3.417f, -3.416f, -8.292f)
                quadToRelative(0f, -0.958f, 0.187f, -2.021f)
                quadToRelative(0.188f, -1.062f, 0.646f, -2.354f)
                quadToRelative(-3.875f, 1.208f, -6.396f, 4.5f)
                reflectiveQuadTo(7.708f, 20f)
                quadToRelative(0f, 5.125f, 3.584f, 8.708f)
                quadToRelative(3.583f, 3.584f, 8.708f, 3.584f)
                close()
                moveToRelative(-0.208f, -12.084f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberSms(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "sms",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(13f, 18.208f)
                quadToRelative(0.708f, 0f, 1.167f, -0.479f)
                quadToRelative(0.458f, -0.479f, 0.458f, -1.187f)
                quadToRelative(0f, -0.667f, -0.458f, -1.146f)
                quadToRelative(-0.459f, -0.479f, -1.167f, -0.479f)
                reflectiveQuadToRelative(-1.167f, 0.479f)
                quadToRelative(-0.458f, 0.479f, -0.458f, 1.146f)
                quadToRelative(0f, 0.708f, 0.458f, 1.187f)
                quadToRelative(0.459f, 0.479f, 1.167f, 0.479f)
                close()
                moveToRelative(7.083f, 0f)
                quadToRelative(0.709f, 0f, 1.188f, -0.479f)
                reflectiveQuadToRelative(0.479f, -1.187f)
                quadToRelative(0f, -0.667f, -0.479f, -1.146f)
                quadToRelative(-0.479f, -0.479f, -1.188f, -0.479f)
                quadToRelative(-0.666f, 0f, -1.145f, 0.479f)
                quadToRelative(-0.48f, 0.479f, -0.48f, 1.146f)
                quadToRelative(0f, 0.708f, 0.48f, 1.187f)
                quadToRelative(0.479f, 0.479f, 1.145f, 0.479f)
                close()
                moveToRelative(6.875f, 0f)
                quadToRelative(0.709f, 0f, 1.188f, -0.479f)
                reflectiveQuadToRelative(0.479f, -1.187f)
                quadToRelative(0f, -0.667f, -0.479f, -1.146f)
                quadToRelative(-0.479f, -0.479f, -1.188f, -0.479f)
                quadToRelative(-0.666f, 0f, -1.146f, 0.479f)
                quadToRelative(-0.479f, 0.479f, -0.479f, 1.146f)
                quadToRelative(0f, 0.708f, 0.479f, 1.187f)
                quadToRelative(0.48f, 0.479f, 1.146f, 0.479f)
                close()
                moveTo(3.625f, 33.125f)
                verticalLineTo(6.208f)
                quadToRelative(0f, -1.041f, 0.771f, -1.833f)
                reflectiveQuadToRelative(1.854f, -0.792f)
                horizontalLineToRelative(27.5f)
                quadToRelative(1.042f, 0f, 1.833f, 0.792f)
                quadToRelative(0.792f, 0.792f, 0.792f, 1.833f)
                verticalLineToRelative(20.917f)
                quadToRelative(0f, 1.042f, -0.792f, 1.833f)
                quadToRelative(-0.791f, 0.792f, -1.833f, 0.792f)
                horizontalLineTo(10.125f)
                lineToRelative(-4.292f, 4.292f)
                quadToRelative(-0.625f, 0.625f, -1.416f, 0.27f)
                quadToRelative(-0.792f, -0.354f, -0.792f, -1.187f)
                close()
                moveToRelative(2.625f, -3.25f)
                lineTo(9f, 27.125f)
                horizontalLineToRelative(24.75f)
                verticalLineTo(6.208f)
                horizontalLineTo(6.25f)
                close()
                moveToRelative(0f, -23.667f)
                verticalLineToRelative(23.667f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberPriceChange(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "price_change",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.417f, 26.583f)
                horizontalLineToRelative(2.125f)
                verticalLineToRelative(0.459f)
                quadToRelative(0f, 0.541f, 0.396f, 0.937f)
                quadToRelative(0.395f, 0.396f, 0.937f, 0.396f)
                reflectiveQuadToRelative(0.937f, -0.396f)
                quadToRelative(0.396f, -0.396f, 0.396f, -0.937f)
                verticalLineToRelative(-0.459f)
                horizontalLineToRelative(1.917f)
                quadToRelative(0.625f, 0f, 1.042f, -0.5f)
                quadToRelative(0.416f, -0.5f, 0.416f, -1.125f)
                verticalLineToRelative(-4.75f)
                quadToRelative(0f, -0.666f, -0.416f, -1.125f)
                quadToRelative(-0.417f, -0.458f, -1.042f, -0.458f)
                horizontalLineToRelative(-5.417f)
                verticalLineToRelative(-2.583f)
                horizontalLineToRelative(5.584f)
                quadToRelative(0.541f, 0f, 0.916f, -0.375f)
                reflectiveQuadToRelative(0.375f, -0.959f)
                quadToRelative(0f, -0.541f, -0.395f, -0.916f)
                quadToRelative(-0.396f, -0.375f, -0.938f, -0.375f)
                horizontalLineToRelative(-2.042f)
                verticalLineToRelative(-0.459f)
                quadToRelative(0f, -0.541f, -0.396f, -0.937f)
                quadToRelative(-0.395f, -0.396f, -0.937f, -0.396f)
                reflectiveQuadToRelative(-0.937f, 0.396f)
                quadToRelative(-0.396f, 0.396f, -0.396f, 0.937f)
                verticalLineToRelative(0.459f)
                horizontalLineToRelative(-1.875f)
                quadToRelative(-0.667f, 0f, -1.125f, 0.5f)
                quadToRelative(-0.459f, 0.5f, -0.459f, 1.125f)
                verticalLineToRelative(4.75f)
                quadToRelative(0f, 0.625f, 0.459f, 1.062f)
                quadToRelative(0.458f, 0.438f, 1.125f, 0.438f)
                horizontalLineToRelative(5.291f)
                verticalLineToRelative(2.666f)
                horizontalLineToRelative(-5.583f)
                quadToRelative(-0.542f, 0f, -0.917f, 0.375f)
                reflectiveQuadToRelative(-0.375f, 0.917f)
                quadToRelative(0f, 0.583f, 0.375f, 0.958f)
                reflectiveQuadToRelative(0.959f, 0.375f)
                close()
                moveToRelative(15f, -0.125f)
                quadToRelative(0.166f, 0.25f, 0.458f, 0.25f)
                quadToRelative(0.292f, 0f, 0.5f, -0.25f)
                lineToRelative(2.167f, -2.125f)
                horizontalLineTo(24.25f)
                close()
                moveTo(24.25f, 16.042f)
                horizontalLineToRelative(5.292f)
                lineToRelative(-2.167f, -2.125f)
                quadToRelative(-0.208f, -0.209f, -0.479f, -0.209f)
                reflectiveQuadToRelative(-0.479f, 0.209f)
                close()
                moveToRelative(-18f, 17.041f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.791f)
                quadToRelative(-0.771f, -0.792f, -0.771f, -1.834f)
                verticalLineTo(9.542f)
                quadToRelative(0f, -1.042f, 0.771f, -1.834f)
                quadToRelative(0.771f, -0.791f, 1.854f, -0.791f)
                horizontalLineToRelative(27.5f)
                quadToRelative(1.083f, 0f, 1.854f, 0.791f)
                quadToRelative(0.771f, 0.792f, 0.771f, 1.834f)
                verticalLineToRelative(20.916f)
                quadToRelative(0f, 1.042f, -0.771f, 1.834f)
                quadToRelative(-0.771f, 0.791f, -1.854f, 0.791f)
                close()
                moveToRelative(0f, -2.625f)
                verticalLineTo(9.542f)
                verticalLineToRelative(20.916f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(27.5f)
                verticalLineTo(9.542f)
                horizontalLineTo(6.25f)
                verticalLineToRelative(20.916f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberSignalWifi_0Bar(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "signal_wifi_0_bar",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 34.167f)
                quadToRelative(-0.25f, 0f, -0.479f, -0.084f)
                quadToRelative(-0.229f, -0.083f, -0.438f, -0.291f)
                lineTo(1.292f, 15.958f)
                quadToRelative(-0.417f, -0.375f, -0.396f, -0.916f)
                quadToRelative(0.021f, -0.542f, 0.437f, -0.917f)
                quadToRelative(3.875f, -3.458f, 8.646f, -5.333f)
                quadTo(14.75f, 6.917f, 20f, 6.917f)
                quadToRelative(5.25f, 0f, 10.021f, 1.875f)
                quadToRelative(4.771f, 1.875f, 8.646f, 5.333f)
                quadToRelative(0.416f, 0.375f, 0.437f, 0.917f)
                quadToRelative(0.021f, 0.541f, -0.396f, 0.958f)
                lineTo(20.917f, 33.792f)
                quadToRelative(-0.209f, 0.208f, -0.438f, 0.291f)
                quadToRelative(-0.229f, 0.084f, -0.479f, 0.084f)
                close()
                moveToRelative(0f, -3.125f)
                lineTo(35.792f, 15.25f)
                quadToRelative(-3.5f, -2.708f, -7.438f, -4.208f)
                quadToRelative(-3.937f, -1.5f, -8.354f, -1.5f)
                quadToRelative(-4.375f, 0f, -8.354f, 1.5f)
                quadToRelative(-3.979f, 1.5f, -7.438f, 4.208f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberCalendarMonth(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "calendar_month",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 23.292f)
                quadToRelative(-0.708f, 0f, -1.167f, -0.459f)
                quadToRelative(-0.458f, -0.458f, -0.458f, -1.166f)
                quadToRelative(0f, -0.709f, 0.458f, -1.167f)
                quadToRelative(0.459f, -0.458f, 1.167f, -0.458f)
                reflectiveQuadToRelative(1.167f, 0.458f)
                quadToRelative(0.458f, 0.458f, 0.458f, 1.167f)
                quadToRelative(0f, 0.708f, -0.458f, 1.166f)
                quadToRelative(-0.459f, 0.459f, -1.167f, 0.459f)
                close()
                moveToRelative(-6.667f, 0f)
                quadToRelative(-0.708f, 0f, -1.166f, -0.459f)
                quadToRelative(-0.459f, -0.458f, -0.459f, -1.166f)
                quadToRelative(0f, -0.709f, 0.459f, -1.167f)
                quadToRelative(0.458f, -0.458f, 1.166f, -0.458f)
                quadToRelative(0.709f, 0f, 1.167f, 0.458f)
                quadToRelative(0.458f, 0.458f, 0.458f, 1.167f)
                quadToRelative(0f, 0.708f, -0.458f, 1.166f)
                quadToRelative(-0.458f, 0.459f, -1.167f, 0.459f)
                close()
                moveToRelative(13.334f, 0f)
                quadToRelative(-0.709f, 0f, -1.167f, -0.459f)
                quadToRelative(-0.458f, -0.458f, -0.458f, -1.166f)
                quadToRelative(0f, -0.709f, 0.458f, -1.167f)
                quadToRelative(0.458f, -0.458f, 1.167f, -0.458f)
                quadToRelative(0.708f, 0f, 1.166f, 0.458f)
                quadToRelative(0.459f, 0.458f, 0.459f, 1.167f)
                quadToRelative(0f, 0.708f, -0.459f, 1.166f)
                quadToRelative(-0.458f, 0.459f, -1.166f, 0.459f)
                close()
                moveTo(20f, 29.958f)
                quadToRelative(-0.708f, 0f, -1.167f, -0.458f)
                quadToRelative(-0.458f, -0.458f, -0.458f, -1.167f)
                quadToRelative(0f, -0.708f, 0.458f, -1.166f)
                quadToRelative(0.459f, -0.459f, 1.167f, -0.459f)
                reflectiveQuadToRelative(1.167f, 0.459f)
                quadToRelative(0.458f, 0.458f, 0.458f, 1.166f)
                quadToRelative(0f, 0.709f, -0.458f, 1.167f)
                quadToRelative(-0.459f, 0.458f, -1.167f, 0.458f)
                close()
                moveToRelative(-6.667f, 0f)
                quadToRelative(-0.708f, 0f, -1.166f, -0.458f)
                quadToRelative(-0.459f, -0.458f, -0.459f, -1.167f)
                quadToRelative(0f, -0.708f, 0.459f, -1.166f)
                quadToRelative(0.458f, -0.459f, 1.166f, -0.459f)
                quadToRelative(0.709f, 0f, 1.167f, 0.459f)
                quadToRelative(0.458f, 0.458f, 0.458f, 1.166f)
                quadToRelative(0f, 0.709f, -0.458f, 1.167f)
                quadToRelative(-0.458f, 0.458f, -1.167f, 0.458f)
                close()
                moveToRelative(13.334f, 0f)
                quadToRelative(-0.709f, 0f, -1.167f, -0.458f)
                quadToRelative(-0.458f, -0.458f, -0.458f, -1.167f)
                quadToRelative(0f, -0.708f, 0.458f, -1.166f)
                quadToRelative(0.458f, -0.459f, 1.167f, -0.459f)
                quadToRelative(0.708f, 0f, 1.166f, 0.459f)
                quadToRelative(0.459f, 0.458f, 0.459f, 1.166f)
                quadToRelative(0f, 0.709f, -0.459f, 1.167f)
                quadToRelative(-0.458f, 0.458f, -1.166f, 0.458f)
                close()
                moveTo(7.875f, 36.375f)
                quadToRelative(-1.042f, 0f, -1.833f, -0.771f)
                quadToRelative(-0.792f, -0.771f, -0.792f, -1.854f)
                verticalLineTo(8.958f)
                quadToRelative(0f, -1.041f, 0.792f, -1.833f)
                quadToRelative(0.791f, -0.792f, 1.833f, -0.792f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(4.917f)
                quadToRelative(0f, -0.542f, 0.417f, -0.959f)
                quadToRelative(0.416f, -0.416f, 0.958f, -0.416f)
                quadToRelative(0.583f, 0f, 1f, 0.416f)
                quadToRelative(0.417f, 0.417f, 0.417f, 0.959f)
                verticalLineToRelative(1.416f)
                horizontalLineToRelative(13.666f)
                verticalLineTo(4.917f)
                quadToRelative(0f, -0.542f, 0.396f, -0.959f)
                quadToRelative(0.396f, -0.416f, 0.979f, -0.416f)
                quadToRelative(0.584f, 0f, 1f, 0.416f)
                quadToRelative(0.417f, 0.417f, 0.417f, 0.959f)
                verticalLineToRelative(1.416f)
                horizontalLineToRelative(2.5f)
                quadToRelative(1.042f, 0f, 1.833f, 0.792f)
                quadToRelative(0.792f, 0.792f, 0.792f, 1.833f)
                verticalLineTo(33.75f)
                quadToRelative(0f, 1.083f, -0.792f, 1.854f)
                quadToRelative(-0.791f, 0.771f, -1.833f, 0.771f)
                close()
                moveToRelative(0f, -2.625f)
                horizontalLineToRelative(24.25f)
                verticalLineTo(16.458f)
                horizontalLineTo(7.875f)
                verticalLineTo(33.75f)
                close()
                moveToRelative(0f, -19.958f)
                horizontalLineToRelative(24.25f)
                verticalLineTo(8.958f)
                horizontalLineTo(7.875f)
                close()
                moveToRelative(0f, 0f)
                verticalLineTo(8.958f)
                verticalLineToRelative(4.834f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberHumidityPercentage(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "humidity_percentage",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(24.167f, 29.625f)
                quadToRelative(0.916f, 0f, 1.541f, -0.625f)
                quadToRelative(0.625f, -0.625f, 0.625f, -1.5f)
                quadToRelative(0f, -0.917f, -0.625f, -1.542f)
                reflectiveQuadToRelative(-1.541f, -0.625f)
                quadToRelative(-0.917f, 0f, -1.521f, 0.625f)
                quadToRelative(-0.604f, 0.625f, -0.604f, 1.542f)
                reflectiveQuadToRelative(0.625f, 1.521f)
                quadToRelative(0.625f, 0.604f, 1.5f, 0.604f)
                close()
                moveTo(14.833f, 28.5f)
                quadToRelative(0.375f, 0.375f, 0.917f, 0.375f)
                reflectiveQuadToRelative(0.917f, -0.375f)
                lineToRelative(8.5f, -8.5f)
                quadToRelative(0.375f, -0.375f, 0.375f, -0.917f)
                quadToRelative(0f, -0.541f, -0.375f, -0.916f)
                quadToRelative(-0.417f, -0.417f, -0.938f, -0.417f)
                quadToRelative(-0.521f, 0f, -0.937f, 0.417f)
                lineToRelative(-8.459f, 8.5f)
                quadToRelative(-0.416f, 0.375f, -0.416f, 0.895f)
                quadToRelative(0f, 0.521f, 0.416f, 0.938f)
                close()
                moveToRelative(1f, -7.208f)
                quadToRelative(0.917f, 0f, 1.542f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.5f)
                quadToRelative(0f, -0.917f, -0.625f, -1.542f)
                reflectiveQuadTo(15.833f, 17f)
                quadToRelative(-0.916f, 0f, -1.521f, 0.625f)
                quadToRelative(-0.604f, 0.625f, -0.604f, 1.542f)
                quadToRelative(0f, 0.916f, 0.625f, 1.521f)
                quadToRelative(0.625f, 0.604f, 1.5f, 0.604f)
                close()
                moveTo(20f, 36.542f)
                quadToRelative(-5.25f, 0f, -9.229f, -3.667f)
                quadTo(6.792f, 29.208f, 6.792f, 23f)
                quadToRelative(0f, -3.917f, 3.041f, -8.604f)
                quadTo(12.875f, 9.708f, 19f, 4.333f)
                quadToRelative(0.208f, -0.166f, 0.458f, -0.27f)
                quadToRelative(0.25f, -0.105f, 0.542f, -0.105f)
                quadToRelative(0.292f, 0f, 0.542f, 0.105f)
                quadToRelative(0.25f, 0.104f, 0.458f, 0.27f)
                quadToRelative(6.125f, 5.375f, 9.167f, 10.063f)
                quadToRelative(3.041f, 4.687f, 3.041f, 8.604f)
                quadToRelative(0f, 6.208f, -3.979f, 9.875f)
                reflectiveQuadTo(20f, 36.542f)
                close()
                moveToRelative(0f, -2.667f)
                quadToRelative(4.458f, 0f, 7.5f, -3.063f)
                quadTo(30.542f, 27.75f, 30.542f, 23f)
                quadToRelative(0f, -3.167f, -2.667f, -7.229f)
                quadTo(25.208f, 11.708f, 20f, 7.042f)
                quadToRelative(-5.208f, 4.666f, -7.875f, 8.729f)
                quadTo(9.458f, 19.833f, 9.458f, 23f)
                quadToRelative(0f, 4.75f, 3.042f, 7.812f)
                quadToRelative(3.042f, 3.063f, 7.5f, 3.063f)
                close()
                moveToRelative(0f, -9.917f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberAttachMoney(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "attach_money",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20.042f, 34.792f)
                quadToRelative(-0.542f, 0f, -0.917f, -0.396f)
                reflectiveQuadToRelative(-0.375f, -0.938f)
                verticalLineToRelative(-2.166f)
                quadToRelative(-1.958f, -0.334f, -3.375f, -1.396f)
                quadToRelative(-1.417f, -1.063f, -2.208f, -2.771f)
                quadToRelative(-0.25f, -0.458f, -0.021f, -0.979f)
                quadToRelative(0.229f, -0.521f, 0.729f, -0.771f)
                quadToRelative(0.5f, -0.208f, 1f, 0f)
                reflectiveQuadToRelative(0.75f, 0.708f)
                quadToRelative(0.75f, 1.375f, 1.896f, 2.063f)
                quadToRelative(1.146f, 0.687f, 2.771f, 0.687f)
                quadToRelative(1.916f, 0f, 3.187f, -0.937f)
                quadToRelative(1.271f, -0.938f, 1.271f, -2.604f)
                quadToRelative(0f, -1.709f, -1.083f, -2.709f)
                quadToRelative(-1.084f, -1f, -4.334f, -2.041f)
                quadToRelative(-3.083f, -0.959f, -4.5f, -2.459f)
                quadToRelative(-1.416f, -1.5f, -1.416f, -3.875f)
                reflectiveQuadToRelative(1.562f, -3.875f)
                quadToRelative(1.563f, -1.5f, 3.771f, -1.708f)
                verticalLineTo(6.5f)
                quadToRelative(0f, -0.542f, 0.375f, -0.917f)
                reflectiveQuadToRelative(0.917f, -0.375f)
                quadToRelative(0.541f, 0f, 0.937f, 0.375f)
                reflectiveQuadToRelative(0.396f, 0.917f)
                verticalLineToRelative(2.125f)
                quadToRelative(1.542f, 0.167f, 2.687f, 0.917f)
                quadToRelative(1.146f, 0.75f, 1.896f, 1.833f)
                quadToRelative(0.292f, 0.417f, 0.125f, 0.938f)
                quadToRelative(-0.166f, 0.52f, -0.708f, 0.729f)
                quadToRelative(-0.458f, 0.208f, -0.979f, 0.041f)
                quadToRelative(-0.521f, -0.166f, -0.896f, -0.625f)
                quadToRelative(-0.542f, -0.708f, -1.396f, -1.062f)
                quadToRelative(-0.854f, -0.354f, -2.021f, -0.354f)
                quadToRelative(-1.875f, 0f, -2.958f, 0.854f)
                quadToRelative(-1.083f, 0.854f, -1.083f, 2.312f)
                quadToRelative(0f, 1.459f, 1.166f, 2.375f)
                quadToRelative(1.167f, 0.917f, 4.375f, 1.875f)
                quadToRelative(2.917f, 0.875f, 4.355f, 2.5f)
                quadToRelative(1.437f, 1.625f, 1.437f, 4.167f)
                quadToRelative(-0.042f, 2.667f, -1.625f, 4.25f)
                quadToRelative(-1.583f, 1.583f, -4.375f, 2f)
                verticalLineToRelative(2.083f)
                quadToRelative(0f, 0.542f, -0.396f, 0.938f)
                quadToRelative(-0.396f, 0.396f, -0.937f, 0.396f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberGlobeUk(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "globe_uk",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(479.837f, 905.334f)
                quadToRelative(18.565f, 0f, 35.822f, -2f)
                quadToRelative(17.258f, -2f, 34.341f, -6.176f)
                lineToRelative(-49.5f, -74.324f)
                horizontalLineTo(356.667f)
                verticalLineToRelative(-41.119f)
                quadToRelative(0f, -33.923f, 23.94f, -58.152f)
                quadToRelative(23.941f, -24.23f, 58.226f, -24.23f)
                horizontalLineToRelative(82.334f)
                verticalLineTo(576f)
                horizontalLineToRelative(-81.874f)
                quadToRelative(-16.832f, 0f, -29.146f, -12.564f)
                reflectiveQuadToRelative(-12.314f, -29.308f)
                verticalLineTo(452f)
                horizontalLineToRelative(-18.416f)
                quadToRelative(-26.601f, 0f, -45.426f, -17.977f)
                quadToRelative(-18.825f, -17.976f, -18.825f, -44.684f)
                quadToRelative(0f, -9.245f, 2.667f, -18.438f)
                reflectiveQuadToRelative(8f, -17.401f)
                lineToRelative(64f, -93.834f)
                quadTo(285.69f, 289.194f, 218.178f, 375.855f)
                reflectiveQuadTo(150.666f, 576f)
                horizontalLineToRelative(41.167f)
                verticalLineToRelative(-41.532f)
                quadToRelative(0f, -16.801f, 12f, -28.885f)
                quadToRelative(12f, -12.083f, 28.802f, -12.083f)
                horizontalLineToRelative(82.404f)
                quadToRelative(16.627f, 0f, 29.127f, 12.048f)
                quadToRelative(12.501f, 12.048f, 12.501f, 28.873f)
                verticalLineToRelative(41.588f)
                quadToRelative(0f, 16.824f, -12.501f, 28.824f)
                quadToRelative(-12.5f, 12f, -29.101f, 12f)
                verticalLineToRelative(41.526f)
                quadToRelative(0f, 34.258f, -24.083f, 58.033f)
                quadToRelative(-24.082f, 23.775f, -58.202f, 23.775f)
                horizontalLineToRelative(-37.947f)
                quadToRelative(42.984f, 74.542f, 118.165f, 119.854f)
                quadToRelative(75.18f, 45.313f, 166.839f, 45.313f)
                close()
                moveToRelative(312.965f, -228.501f)
                quadToRelative(7.865f, -24f, 12.198f, -49.265f)
                quadToRelative(4.334f, -25.265f, 4.334f, -52.076f)
                quadToRelative(0f, -114.835f, -70.013f, -203.013f)
                quadToRelative(-70.012f, -88.178f, -176.821f, -115.813f)
                verticalLineToRelative(113.179f)
                quadToRelative(34.167f, 0f, 58.26f, 24.135f)
                quadToRelative(24.094f, 24.135f, 24.094f, 58.026f)
                verticalLineToRelative(82.161f)
                quadToRelative(19.48f, 0f, 35.389f, 5.188f)
                quadToRelative(15.91f, 5.188f, 29.825f, 19.256f)
                lineToRelative(82.734f, 118.222f)
                close()
                moveToRelative(-312.582f, 292.5f)
                quadToRelative(-81.439f, 0f, -153.108f, -31.096f)
                quadToRelative(-71.669f, -31.097f, -124.974f, -84.5f)
                quadToRelative(-53.305f, -53.404f, -84.388f, -125.009f)
                quadToRelative(-31.083f, -71.605f, -31.083f, -153.019f)
                quadToRelative(0f, -81.495f, 31.096f, -153.214f)
                quadToRelative(31.097f, -71.719f, 84.5f, -124.857f)
                quadToRelative(53.404f, -53.138f, 125.009f, -84.055f)
                quadToRelative(71.605f, -30.916f, 153.019f, -30.916f)
                quadToRelative(81.495f, 0f, 153.218f, 31.008f)
                quadToRelative(71.723f, 31.009f, 124.857f, 84.167f)
                reflectiveQuadToRelative(84.051f, 124.869f)
                quadToRelative(30.916f, 71.712f, 30.916f, 153.069f)
                quadToRelative(0f, 81.439f, -30.929f, 153.108f)
                quadToRelative(-30.93f, 71.669f, -84.167f, 124.851f)
                reflectiveQuadToRelative(-124.948f, 84.388f)
                quadToRelative(-71.712f, 31.206f, -153.069f, 31.206f)
                close()
            }
        }.build()
    }
}