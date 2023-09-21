package org.company.app.ui

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.IntSize
import org.company.app.theme.Gradient

@Composable
fun getGradientBrush(animate: Boolean, forSize: IntSize, gradient: Gradient): Brush {
    val limit = 0.9f

    val progressAnimated by if(animate) {
        val transition = rememberInfiniteTransition(label = "shimmer")
        transition.animateFloat(
            initialValue = -limit,
            targetValue = limit,
            animationSpec = infiniteRepeatable(
                animation = tween(1700, easing = LinearEasing),
                repeatMode = RepeatMode.Reverse
            ), label = "shimmer"
        )
    } else {
        remember { mutableStateOf(1f) }
    }

    val offset = forSize.width * progressAnimated
    val gradientWidth = forSize.width

    return Brush.horizontalGradient(
        colors = gradient.colors,
        startX = Offset(offset, 0f).x,
        endX = Offset(offset + gradientWidth, forSize.height.toFloat()).x
    )
}