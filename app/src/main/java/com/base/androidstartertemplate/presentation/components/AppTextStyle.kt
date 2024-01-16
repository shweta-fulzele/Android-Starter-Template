package com.base.androidstartertemplate.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.base.androidstartertemplate.themes.theme.AppTheme
import com.base.androidstartertemplate.themes.theme.errorRed
import com.base.androidstartertemplate.utility.annotation.MultiplePreviews


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
