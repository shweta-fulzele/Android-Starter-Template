package com.base.androidstartertemplate.presentation.extension

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.base.androidstartertemplate.presentation.ui.theme.AppFont

// Create extension function for TextStyle

fun TextStyle.h1Medium() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 48.sp,
    letterSpacing = 0.sp
)

fun TextStyle.h2Medium() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 40.sp,
    letterSpacing = 0.5.sp
)

fun TextStyle.h3Medium() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 32.sp,
    letterSpacing = 0.25.sp
)

fun TextStyle.h4Medium() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 24.sp,
    letterSpacing = 0.sp
)

fun TextStyle.h5Medium() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 20.sp,
    letterSpacing = 0.5.sp
)

fun TextStyle.h6Medium() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 16.sp,
    letterSpacing = 0.5.sp
)

fun TextStyle.titleLarge() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.Medium,
    fontSize = 18.sp,
    letterSpacing = 0.25.sp
)

fun TextStyle.titleRegular() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp,
    letterSpacing = 0.15.sp
)

fun TextStyle.titleSmall() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 14.sp,
    letterSpacing = 1.sp
)

fun TextStyle.body1Regular() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 24.sp,
    letterSpacing = 1.sp
)

fun TextStyle.body2Regular() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 18.sp,
    letterSpacing = 0.8.sp,
)

fun TextStyle.body3Regular() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 16.sp,
    letterSpacing = 0.5.sp,
)

fun TextStyle.body4Regular() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 14.sp,
    letterSpacing = 0.25.sp,
)

fun TextStyle.body5Regular() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 12.sp,
    letterSpacing = 0.2.sp,
)

fun TextStyle.body6Regular() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 10.sp,
    letterSpacing = 0.4.sp,
)

fun TextStyle.hyperlink() = TextStyle(
    fontFamily = AppFont,
    fontWeight = FontWeight.SemiBold,
    fontSize = 14.sp,
    letterSpacing = 0.25.sp,
)





