package org.company.app.ui

import TextStyles
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.m2f.model.Style
import org.company.app.rememberAttachMoney
import org.company.app.rememberCalendarMonth
import org.company.app.rememberGlobeUk
import org.company.app.rememberSignalWifi_0Bar

enum class Row {
    Data,
    Validity,
    Price,
    Coverage
}

enum class Currency(val currency: String, val shortName: String, val char: String) {
    USD("USD", "US", "$"),
    EUR("EUR", "EU", "€"),
    HKD("HKD", "HK", "$")
}

sealed interface PackageItem {

    @Composable
    fun render(style: Style)

    sealed class RowItem(
        val row: Row,
        val title: String,
        val value: String,
        callback: () -> Unit
    ) : PackageItem {

        @Composable
        override fun render(style: Style) {
            CardItem(row = row, title = title, style = style) {
                Text(
                    value,
                    style = TextStyles.countryPackageRightText.let {
                        if (style == Style.Light) {
                            it.copy(color = Color.White)
                        } else {
                            it
                        }
                    }
                )
            }
        }

        class Data(data: String, callback: () -> Unit = {}) :
            RowItem(Row.Data, "Data", data, callback)

        class Validity(validity: String, callback: () -> Unit = {}) :
            RowItem(Row.Validity, "Validity", validity, callback)

        class Price(price: Double, currency: Currency, callback: () -> Unit = {}) :
            RowItem(Row.Price, "Price", "$price ${currency.char}", callback)

        class DiscountPrice(price: Double, currency: Currency, callback: () -> Unit = {}) :
            RowItem(Row.Price, "Price", "$price ${currency.char}", callback) {
            @Composable
            override fun render(style: Style) {
                CardItem(row = row, title = title, style = style) {
                    Text(
                        value,
                        style = TextStyles.countryPackageRightTextStrikethrough.let {
                            when (style) {
                                Style.Dark -> it
                                Style.Light -> it.copy(color = Color.White)
                            }
                        }
                    )
                }
            }
        }

        sealed class Coverage(coverage: String, callback: () -> Unit = {}) :
            RowItem(Row.Coverage, "Coverage", coverage, callback) {

            class SingleCountryCoverage(country: String, callback: () -> Unit = {}) : Coverage(country, callback)

            class MultipleCountryCoverage(numberOfCountries: Int, private val callback: () -> Unit = {}) :
                Coverage("$numberOfCountries Countries", callback) {

                @Composable
                override fun render(style: Style) {
                    CardItem(row = row, title = title, style = style) {
                        val color = when (style) {
                            Style.Dark -> org.company.app.theme.MainGrey
                            Style.Light -> Color.White
                        }
                        Box(
                            modifier = Modifier
                                .clickable { callback() }
                                .border(
                                    1.dp,
                                    color,
                                    shape = RoundedCornerShape(4.dp)
                                )

                        ) {
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .padding(8.dp),
                                text = value.uppercase(),
                                style = TextStyles.countryPackageButton.let {
                                    when (style) {
                                        Style.Dark -> it
                                        Style.Light -> it.copy(color = Color.White)
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CardItem(row: Row, title: String, style: Style, value: @Composable () -> Unit) {
    val icon = when(row) {
        Row.Data -> rememberSignalWifi_0Bar()
        Row.Validity -> rememberCalendarMonth()
        Row.Price -> rememberAttachMoney()
        Row.Coverage -> rememberGlobeUk()
    }
    Row(
        modifier = Modifier
            .padding(vertical = 24.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .padding(end = 10.dp)
                .size(24.dp),
            colorFilter = if (style == Style.Light) {
                ColorFilter.tint(Color.White)
            } else {
                null
            }
        )
        Text(
            title.uppercase(),
            style = TextStyles.countryPackageLeftText.let {
                if (style == Style.Light) {
                    it.copy(color = Color.White)
                } else {
                    it
                }
            },
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.weight(1F))
        value()
    }
}
