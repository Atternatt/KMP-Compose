package org.company.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.company.app.theme.Gradient
import org.company.app.theme.Promotion
import org.company.app.theme.White


@Composable
fun PromotionBadge(text: String, background: Gradient = Promotion, modifier: Modifier = Modifier) {
    var size: IntSize by remember { mutableStateOf(IntSize.Zero) }

    val brush = getGradientBrush(
        animate = true,
        forSize = size,
        gradient = background
    )

    Row(
        modifier = modifier
            .height(24.dp)
            .background(brush, shape = RoundedCornerShape(12.dp))
            .onGloballyPositioned { coordinates ->
                size = coordinates.size
            },
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 8.dp),
            text = text.uppercase(),
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(600),
                color = White,
                letterSpacing = 1.sp
            )
        )
    }
}