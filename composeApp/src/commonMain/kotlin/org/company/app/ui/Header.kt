package org.company.app.ui

import TextStyles
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.m2f.model.Style

sealed class Header : PackageItem {
    data class OperatorHeader(
        val title: String
    ) : Header() {
        @Composable
        override fun render(style: Style) {
            CardHeaderText(title, style)
        }
    }

    data class OperatorCountry(
        val title: String,
        val country: String
    ) : Header() {
        @Composable
        override fun render(style: Style) {
            CardHeaderText(title, style, country)
        }
    }

    object Empty : Header() {

        @Composable
        override fun render(style: Style) {}

    }
}

@Composable
private fun CardHeaderText(
    title: String,
    style: Style = Style.Light,
    subtitle: String = ""
) {
    Column {
        Text(
            title,
            style = TextStyles.h2.let {
                if (style == Style.Light) {
                    it.copy(color = Color.White)
                } else {
                    it
                }
            },
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(top = 20.dp, start = 20.dp)
        )
        Text(
            subtitle,
            style = TextStyles.countryPackageCountry.let {
                when (style) {
                    Style.Light -> it.copy(color = Color.White)
                    Style.Dark -> it
                }
            },
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(start = 20.dp, bottom = 20.dp)
        )
    }
}
