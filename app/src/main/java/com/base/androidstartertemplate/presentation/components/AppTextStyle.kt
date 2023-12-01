package com.base.androidstartertemplate.presentation.components

import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.base.androidstartertemplate.utility.annotation.MultiplePreviews
import com.base.androidstartertemplate.ui.theme.AppTheme
import com.base.androidstartertemplate.ui.theme.errorRed


@Composable
fun TitleBold(text: String,
              color: Color = AppTheme.colors.primary,
              modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleLarge,
        modifier = modifier,
        color = color,

    )
}

@Composable
fun TextMedium(text: String,
               color: Color,
               modifier: Modifier = Modifier, alignment: TextAlign = TextAlign.Center) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        modifier = modifier,
        color = color,
        textAlign = alignment
    )
}

@Composable
fun ErrorText(text: String,
              color: Color = errorRed,
              modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        modifier = modifier,
        color = color,
    )
}

@MultiplePreviews()
@Composable
fun PreviewTextStyles() {
}
