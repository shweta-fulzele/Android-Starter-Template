package com.base.androidstartertemplate.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import com.base.androidstartertemplate.ui.AppDimens
import com.base.androidstartertemplate.ui.smallDimensions
import com.base.androidstartertemplate.ui.sw360Dimensions
import com.google.accompanist.systemuicontroller.rememberSystemUiController


/**
 * Color palette for app light theme
 * **/

private val LightColorPalette = AppColors(
    primary = primaryLight,
    secondary = secondaryLight,
    transparent = transparent
)

private val DarkColorPalette = AppColors(
    primary = primaryDark,
    secondary = secondaryDark,
    transparent = transparent

)

@Composable
fun ProvideDimens(dimensions: AppDimens, content: @Composable () -> Unit) {
    val dimensionSet = remember { dimensions }
    CompositionLocalProvider(LocalAppDimens provides dimensionSet, content = content)
}

private val LocalAppDimens = staticCompositionLocalOf { smallDimensions }

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            if (darkTheme) DarkColorPalette else LightColorPalette
        } else {
            if (darkTheme) DarkColorPalette else LightColorPalette
        }

    val sysUiController = rememberSystemUiController()
    SideEffect {
        sysUiController.setSystemBarsColor(
            color = colors.transparent
        )
    }
    val configuration = LocalConfiguration.current
    val dimensions = if (configuration.screenWidthDp <= 420) smallDimensions else sw360Dimensions

    val typography = AppTypography()

    ProvideDimens(dimensions = dimensions) {
        ProvideTheme(colors, typography) {
            MaterialTheme(
                colors = debugColors(darkTheme),
                shapes = AppShapes,
                content = content
            )
        }
    }

}

object AppTheme {
    val colors: AppColors
        @Composable
        get() = LocalAppColors.current

    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalAppTypography.current

    val dimens: AppDimens
        @Composable
        get() = LocalAppDimens.current

}

/**
 *  custom Color Palette
 */
@Stable
class AppColors(
    primary: Color,
    secondary: Color,
    transparent: Color
) {

    var primary by mutableStateOf(primary)
        private set

    var secondary by mutableStateOf(secondary)
        private set

    var transparent by mutableStateOf(transparent)
        private set
    fun update(other: AppColors) {
        primary = other.primary
        secondary = other.secondary
        transparent = other.transparent

    }

    fun copy(): AppColors = AppColors(
        primary = primary,
        secondary = secondary,
        transparent = transparent

    )
}

@Composable
fun ProvideTheme(
    colors: AppColors,
    typography: AppTypography,
    content: @Composable () -> Unit
) {
    val colorPalette = remember {
        // Explicitly creating a new object here so we don't mutate the initial [colors]
        // provided, and overwrite the values set in it.
        colors.copy()
    }
    colorPalette.update(colors)
    CompositionLocalProvider(
        LocalAppColors provides colorPalette,
        LocalAppTypography provides typography,
        content = content
    )
}

private val LocalAppTypography = staticCompositionLocalOf<AppTypography> {
    error("No AppTypography provided")
}

private val LocalAppColors = staticCompositionLocalOf<AppColors> {
    error("No AppColorPalette provided")
}

/**
 * A Material [Colors] implementation which sets all colors to [debugColor] to discourage usage of
 * [MaterialTheme.colors] in preference to [AppTheme.colors].
 */
fun debugColors(
    darkTheme: Boolean,
    debugColor: Color = Color.Magenta
) = Colors(
    primary = debugColor,
    primaryVariant = debugColor,
    secondary = debugColor,
    secondaryVariant = debugColor,
    background = debugColor,
    surface = debugColor,
    error = debugColor,
    onPrimary = debugColor,
    onSecondary = debugColor,
    onBackground = debugColor,
    onSurface = debugColor,
    onError = debugColor,
    isLight = !darkTheme
)