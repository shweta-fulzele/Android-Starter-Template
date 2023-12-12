package com.base.androidstartertemplate.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.base.androidstartertemplate.R

// Set of dash app typography styles
val Satoshi = FontFamily(
    Font(R.font.satoshi_black, weight = FontWeight.Black),
    Font(R.font.satoshi_bold, weight = FontWeight.Bold),
    Font(R.font.satoshi_italic, style = FontStyle.Italic),
    Font(R.font.satoshi_light, weight = FontWeight.Light),
    Font(R.font.satoshi_medium, weight = FontWeight.Medium),
    Font(R.font.satoshi_medium, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(R.font.satoshi_medium, weight = FontWeight.Normal),
)

class AppTypography internal constructor(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h4: TextStyle,
    val h5: TextStyle,
    val h6: TextStyle,
    val titleLarge: TextStyle,
    val titleRegular: TextStyle,
    val titleSmall: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val body3: TextStyle,
    val body4: TextStyle,
    val body5: TextStyle,
    val body6: TextStyle,
    val button: TextStyle,
    val caption: TextStyle,
    val overline: TextStyle,
    val hyperlink: TextStyle
) {
    constructor(
        defaultFontFamily: FontFamily = Satoshi,
        h1: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 48.sp,
            letterSpacing = 0.sp
        ),
        h2: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 40.sp,
            letterSpacing = 0.5.sp
        ),
        h3: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 32.sp,
            letterSpacing = 0.25.sp
        ),
        h4: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            letterSpacing = 0.sp
        ),
        h5: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            letterSpacing = 0.5.sp
        ),
        h6: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            letterSpacing = 0.5.sp
        ),

        titleLarge: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            letterSpacing = 0.25.sp
        ),

        titleRegular: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            letterSpacing = 0.15.sp
        ),

        titleSmall: TextStyle = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            letterSpacing = 1.sp
        ),

        body1: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            letterSpacing = 1.sp
        ),

        body2: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            letterSpacing = 0.8.sp
        ),

        body3: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            letterSpacing = 0.5.sp,
        ),

        body4: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            letterSpacing = 0.25.sp,
        ),

        body5: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            letterSpacing = 0.2.sp,
        ),

        body6: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 10.sp,
            letterSpacing = 0.4.sp,
        ),

        button: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.Medium,
            fontSize = (16).sp,
        ),

        caption: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.Normal,
            fontSize = (10).sp,
        ),

        overline: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = (8).sp,
        ),

        hyperlink: TextStyle = TextStyle(
            fontFamily = Satoshi,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            letterSpacing = 0.25.sp,
        )

    ) : this(
        h1 = h1.withDefaultFontFamily(defaultFontFamily),
        h2 = h2.withDefaultFontFamily(defaultFontFamily),
        h3 = h3.withDefaultFontFamily(defaultFontFamily),
        h4 = h4.withDefaultFontFamily(defaultFontFamily),
        h5 = h5.withDefaultFontFamily(defaultFontFamily),
        h6 = h6.withDefaultFontFamily(defaultFontFamily),
        titleLarge = titleLarge.withDefaultFontFamily(defaultFontFamily),
        titleRegular = titleRegular.withDefaultFontFamily(defaultFontFamily),
        titleSmall = titleSmall.withDefaultFontFamily(defaultFontFamily),
        body1 = body1.withDefaultFontFamily(defaultFontFamily),
        body2 = body2.withDefaultFontFamily(defaultFontFamily),
        body3 = body3.withDefaultFontFamily(defaultFontFamily),
        body4 = body4.withDefaultFontFamily(defaultFontFamily),
        body5 = body5.withDefaultFontFamily(defaultFontFamily),
        body6 = body6.withDefaultFontFamily(defaultFontFamily),
        button = button.withDefaultFontFamily(defaultFontFamily),
        caption = caption.withDefaultFontFamily(defaultFontFamily),
        overline = overline.withDefaultFontFamily(defaultFontFamily),
        hyperlink = hyperlink.withDefaultFontFamily(defaultFontFamily)
    )

    /*   override fun equals(other: Any?): Boolean {
           if (this === other) return true
           if (other !is Typography) return false

           if (h1 != other.h1) return false
           if (h2 != other.h2) return false
           if (h3 != other.h3) return false
           if (h4 != other.h4) return false
           if (h5 != other.h5) return false
           if (h6 != other.h6) return false
           if (subtitle1 != other.subtitle1) return false
           if (subtitle2 != other.subtitle2) return false
           if (body1 != other.body1) return false
           if (body2 != other.body2) return false
           if (button != other.button) return false
           if (caption != other.caption) return false
           if (overline != other.overline) return false

           return true
       }*/

    override fun hashCode(): Int {
        var result = h1.hashCode()
        result = 31 * result + h2.hashCode()
        result = 31 * result + h3.hashCode()
        result = 31 * result + h4.hashCode()
        result = 31 * result + h5.hashCode()
        result = 31 * result + h6.hashCode()
        result = 31 * result + titleLarge.hashCode()
        result = 31 * result + titleRegular.hashCode()
        result = 31 * result + titleSmall.hashCode()
        result = 31 * result + body1.hashCode()
        result = 31 * result + body2.hashCode()
        result = 31 * result + body3.hashCode()
        result = 31 * result + body4.hashCode()
        result = 31 * result + body5.hashCode()
        result = 31 * result + body6.hashCode()
        result = 31 * result + button.hashCode()
        result = 31 * result + caption.hashCode()
        result = 31 * result + overline.hashCode()
        result = 31 * result + hyperlink.hashCode()
        return result
    }
    override fun toString(): String {
        return "AppTypography(h1=$h1, h2=$h2, h3=$h3, h4=$h4, h5=$h5, h6=$h6, titleLarge=$titleLarge, titleRegular=$titleRegular, titleSmall=$titleSmall, body1=$body1, body2=$body2, body3=$body3, body4=$body4, body5=$body5, body6=$body6, button=$button, caption=$caption, overline=$overline, hyperlink=$hyperlink)"
    }

}

private fun TextStyle.withDefaultFontFamily(default: FontFamily): TextStyle {
    return if (fontFamily != null) this else copy(fontFamily = default)
}
