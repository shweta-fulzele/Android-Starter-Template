package com.base.androidstartertemplate.utility

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.base.androidstartertemplate.ui.theme.Font

// Create extension function for TextStyle

fun String.addExclamation(): String {
    return "$this!"
}