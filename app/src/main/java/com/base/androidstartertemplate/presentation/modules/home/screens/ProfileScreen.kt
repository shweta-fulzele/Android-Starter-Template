package com.base.androidstartertemplate.presentation.modules.home.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.base.androidstartertemplate.R
import com.base.androidstartertemplate.themes.theme.AppTheme.typography

/**
 * Composable function that represents the profile screen of the application.
 */
@Composable
fun ProfileScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = stringResource(id = R.string.profile),
            style = typography.titleLarge,

        )
    }
}