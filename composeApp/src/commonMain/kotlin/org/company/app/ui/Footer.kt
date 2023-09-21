package org.company.app.ui

import TextStyles
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.m2f.model.Style
import org.company.app.rememberHumidityPercentage
import org.company.app.utils.DecimalFormat

sealed class Footer : PackageItem {

    class ViewPackage(private val onButtonClick: () -> Unit) : Footer() {

        @Composable
        override fun render(style: Style) {
            FullWidthButtonItem(
                style = style,
                buttonTitle = "View Package".uppercase()
            ) {
                onButtonClick()
            }
        }
    }

    data class Promotion(
        private val discountPercent: Int,
        private val promotionalPrice: Double,
        private val currency: Currency
    ) : Footer() {
        @Composable
        override fun render(style: Style) {
            val tint = when (style) {
                Style.Light -> Color.White
                Style.Dark -> Color(0xFF4A4A4A)
            }
            Row(
                modifier = Modifier
                    .padding(start = 12.dp, top = 12.dp, end = 8.dp, bottom = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(
                    8.dp, Alignment.Start
                ),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    imageVector = rememberHumidityPercentage(),
                    contentDescription = null,
                    contentScale = ContentScale.None,
                    colorFilter = ColorFilter.tint(tint)
                )


                Column {
                    Text(
                        text = "SALE PRICE",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 18.sp,
                            fontWeight = FontWeight(600),
                            color = tint,
                            letterSpacing = 1.sp,
                            textDecoration = TextDecoration.Underline,
                        )
                    )
                    Text(
                        text = "($discountPercent% OFF)",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 18.sp,
                            fontWeight = FontWeight(600),
                            color = tint,
                            letterSpacing = 1.sp
                        )
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    modifier = Modifier.padding(end = 8.dp),
                    text = "${currency.shortName} ${currency.char}${
                        DecimalFormat.format(
                            promotionalPrice
                        )
                    }",
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 26.sp,
                        fontWeight = FontWeight(600),
                        color = tint,
                        textAlign = TextAlign.Right,
                    )
                )

            }
        }
    }

    object Empty : Footer() {
        @Composable
        override fun render(style: Style) {

        }
    }
}

@Composable
private fun Footer.FullWidthButtonItem(style: Style, buttonTitle: String, callback: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { callback() }
                .height(44.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(
                    BorderStroke(
                        1.dp,
                        if (style == Style.Light) Color.White else Color(
                            0xFF4A4A4A
                        )
                    ), RoundedCornerShape(8.dp)
                )
        ) {
            Text(
                text = buttonTitle,
                style = TextStyles.countryPackageButton.let {
                    when (style) {
                        Style.Dark -> it
                        Style.Light -> it.copy(color = Color.White)
                    }
                },
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }

}
