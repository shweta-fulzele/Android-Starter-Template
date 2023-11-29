package com.base.androidstartertemplate.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.base.androidstartertemplate.utility.annotation.MultiplePreviews
import com.base.androidstartertemplate.ui.theme.AppTheme
import com.base.androidstartertemplate.ui.theme.TestTheme


@Composable
fun WelcomeText(text: String, color: Color = AppTheme.colors.primary, modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = TestTheme.typography.titleLarge,
        modifier = modifier,
        color = color
    )
}

@MultiplePreviews()
@Composable
fun PreviewTextStyles() {
    WelcomeText("welcome")
}
