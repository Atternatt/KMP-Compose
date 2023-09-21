import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

object TextStyles {
    val h1 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 27.sp,
        lineHeight = 32.sp,
        color = Color(0.29F, 0.29F, 0.29F, 1F),
        letterSpacing = (-0.5).sp,
    )
    val h2 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 19.sp,
        lineHeight = 22.sp,
        color = Color(0.29F, 0.29F, 0.29F, 1F),
        letterSpacing = (-0.2).sp,
    )
    val countryItem = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 20.sp,
        color = Color(0.29F, 0.29F, 0.29F, 1F),
    )
    val countryPackageCountry = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        color = Color(0.29F, 0.29F, 0.29F, 1F),
        letterSpacing = (-0.6).sp,
    )

    val countryPackageLeftText = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 11.sp,
        lineHeight = 14.sp,
        color = Color(0.29F, 0.29F, 0.29F, 1F),
        letterSpacing = 1.sp,
    )
    val countryPackageRightText = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 17.sp,
        lineHeight = 20.sp,
        color = Color(0.29F, 0.29F, 0.29F, 1F),
        letterSpacing = (-0.1).sp,
    )

    val countryPackageRightTextStrikethrough = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 20.sp,
        color = Color(0.29F, 0.29F, 0.29F, 1F),
        letterSpacing = (-0.1).sp,
        textDecoration = TextDecoration.LineThrough
    )

    val countryPackageButton = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 11.sp,
        lineHeight = 11.sp,
        color = Color(0.29F, 0.29F, 0.29F, 1F),
        letterSpacing = 1.sp,
    )

}