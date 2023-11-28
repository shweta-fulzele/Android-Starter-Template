package com.base.androidstartertemplate.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.base.androidstartertemplate.presentation.annotation.MultiplePreviews
import com.base.androidstartertemplate.ui.theme.AppTheme


@Composable
fun WelcomeText(text: String, color: Color = AppTheme.colors.primary, modifier: Modifier = Modifier) {
    Text(
        text = text,
        style =AppTheme.typography.titleLarge,
        modifier = modifier,
        color = color
    )
}

@MultiplePreviews()
@Composable
fun PreviewTextStyles() {
    WelcomeText("welcome")
}
