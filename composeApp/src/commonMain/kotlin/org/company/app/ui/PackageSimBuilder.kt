package org.company.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.m2f.model.Operator
import com.m2f.model.Style
import org.company.app.theme.Gradient
import org.company.app.theme.Promotion
import org.company.app.theme.Transparent
import kotlin.properties.Delegates

class PackageSim private constructor(private val globalStyle: Style) {
    private val headers = mutableListOf<Header>()
    private val rows = mutableListOf<PackageItem.RowItem>()
    private val footers = mutableListOf<Footer>()
    private var footersGradient: Gradient = Transparent
    private var useHeaderDividers: Boolean = false
    private var useRowDividers: Boolean = true
    private var useFooterDividers: Boolean = false
    private var footerStyle: Style = globalStyle
    private var headerStyle: Style = globalStyle

    fun Headers(scope: HeaderScope.() -> Unit) {
        headers.addAll(HeaderScope().apply(scope).headers)
    }

    fun Rows(scope: RowScope.() -> Unit) {
        rows.addAll(RowScope().apply(scope).rows)
    }

    fun Footers(style: Style = Style.Light, scope: FooterScope.() -> Unit) {
        footers.addAll(FooterScope(style).apply(scope).footers)
    }

    companion object {
        @Composable
        operator fun invoke(colors: Gradient, style: Style, builder: PackageSim.() -> Unit) {
            PackageSim(style).apply {
                builder()
                val (startColor, _) = colors
                CountryPackageItem(
                    gradient = colors,
                    style = style,
                    headerStyle = headerStyle,
                    footerStyle = footerStyle,
                    headers = headers,
                    useHeaderDividers = useHeaderDividers,
                    useFooterDividers = useFooterDividers,
                    useRowDividers = useRowDividers,
                    footers = footers,
                    footerGradient = footersGradient,
                    packageItems = rows
                )
            }
        }
    }

    inner class HeaderScope(style: Style = globalStyle) {

        init {
            headerStyle = style
        }

        private val _headers = mutableListOf<Header>()
        val headers: List<Header> = _headers
        var useDivider: Boolean by Delegates.observable(false) { _, _, new ->
            useHeaderDividers = new
        }

        operator fun Header.unaryPlus() {
            _headers.add(this)
        }
    }

    inner class RowScope {
        private val _rows = mutableListOf<PackageItem.RowItem>()
        val rows: List<PackageItem.RowItem> = _rows
        var useDivider: Boolean by Delegates.observable(false) { _, _, new ->
            useRowDividers = new
        }

        operator fun PackageItem.RowItem.unaryPlus() {
            _rows.add(this)
        }
    }

    inner class FooterScope(style: Style = globalStyle) {

        init {
            footerStyle = style
        }

        private val _footers = mutableListOf<Footer>()
        val footers: List<Footer> = _footers

        var useDivider: Boolean by Delegates.observable(false) { _, _, new ->
            useFooterDividers = new
        }

        var background: Gradient by Delegates.observable(Transparent) { _, _, new ->
            footersGradient = new
        }

        operator fun Footer.unaryPlus() {
            _footers.add(this)
        }
    }
}

@Composable
internal fun CountryPackageItem(
    gradient: Gradient,
    style: Style = Style.Light,
    headerStyle: Style = style,
    footerStyle: Style = style,
    headers: List<Header> = listOf(Header.Empty),
    useHeaderDividers: Boolean = false,
    packageItems: List<PackageItem>,
    useRowDividers: Boolean = true,
    footers: List<Footer> = listOf(Footer.Empty),
    footerGradient: Gradient,
    useFooterDividers: Boolean = false,
    cornerRadius: Dp = 8.dp
) {
    Box(
        Modifier
            .background(Color.Transparent)
            .padding(start = 20.dp, end = 20.dp)
    ) {

        var size: IntSize by remember { mutableStateOf(IntSize.Zero) }

        val brush = getGradientBrush(
            animate = false,
            forSize = size,
            gradient
        )

        Column(modifier = Modifier
            .shadow(2.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(size = cornerRadius))
            .background(
                brush = brush
            )
            .onGloballyPositioned { coordinates ->
                size = coordinates.size

            }) {

            //Header
            Column {
                headers.forEachIndexed { index, header ->
                    header.render(style = style)
                    if (useHeaderDividers && index != headers.lastIndex) {
                        Divider(headerStyle)
                    }
                }
            }
            //Body
            Divider(style)
            Column {
                packageItems.forEachIndexed { index, packageItem ->
                    packageItem.render(style = style)
                    if (useRowDividers && index != packageItems.lastIndex) {
                        Divider(style)
                    }
                }
            }
            Divider(style)

            //Footer
            var footerSize by remember { mutableStateOf(IntSize.Zero) }
            val footerBrush = getGradientBrush(
                animate = true,
                forSize = footerSize,
                gradient = footerGradient
            )
            Column(
                modifier = Modifier
                    .background(footerBrush)
                    .onGloballyPositioned {
                        footerSize = it.size
                    }
            ) {
                footers.forEachIndexed { index, footer ->
                    footer.render(style = footerStyle)
                    if (useFooterDividers && index != footers.lastIndex) {
                        Divider(footerStyle)
                    }
                }
            }
        }
    }
}

@Composable
fun Divider(style: Style) {
    Box(
        modifier = Modifier
            .height(1.dp)
            .background(
                if (style == Style.Light)
                    Color.White.copy(alpha = 0.15F)
                else
                    Color(0x27232323)
            )
            .fillMaxSize()
    )
}

