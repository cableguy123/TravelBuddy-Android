package jp.co.we.travelbuddy.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
/**
*
* @fileName    : Theme.kt
* @author      : imseoghyeon
* @description : テーマ設定
*
**/
//　ダークテーマ
private val DarkColorScheme = darkColorScheme(
    primary = android_dark_primary,
    onPrimary = android_dark_onPrimary,
    primaryContainer = android_dark_primaryContainer,
    onPrimaryContainer = android_dark_onPrimaryContainer,
    secondary = android_dark_secondary,
    onSecondary = android_dark_onSecondary,
    secondaryContainer = android_dark_secondaryContainer,
    onSecondaryContainer = android_dark_onSecondaryContainer,
    tertiary = android_dark_tertiary,
    onTertiary = android_dark_onTertiary,
    tertiaryContainer = android_dark_tertiaryContainer,
    onTertiaryContainer = android_dark_onTertiaryContainer,
    error = android_dark_error,
    errorContainer = android_dark_errorContainer,
    onError = android_dark_onError,
    onErrorContainer = android_dark_onErrorContainer,
    background = android_dark_background,
    onBackground = android_dark_onBackground,
    surface = android_dark_surface,
    onSurface = android_dark_onSurface,
    surfaceVariant = android_dark_surfaceVariant,
    onSurfaceVariant = android_dark_onSurfaceVariant,
    outline = android_dark_outline,
    inverseOnSurface = android_dark_inverseOnSurface,
    inverseSurface = android_dark_inverseSurface,
    inversePrimary = android_dark_inversePrimary,
    surfaceTint = android_dark_surfaceTint,
    outlineVariant = android_dark_outlineVariant,
    scrim = android_dark_scrim,
)

//　Customデフォルトテーマ
private val customColorTheme = lightColorScheme(
    primary = android_default_Primary,
    onPrimary = android_default_onPrimary,
    primaryContainer = android_default_primaryContainer,
    onPrimaryContainer = android_default_onPrimaryContainer,
    inversePrimary = android_default_inversePrimary,
    secondary = android_default_secondary,
    onSecondary = android_default_onSecondary,
    secondaryContainer = android_default_secondaryContainer,
    onSecondaryContainer = android_default_onSecondaryContainer,
    tertiary = android_default_tertiary,
    onTertiary = android_default_onTertiary,
    tertiaryContainer = android_default_tertiaryContainer,
    onTertiaryContainer = android_default_onTertiaryContainer,
    background = android_default_background,
    onBackground = android_default_onBackground,
    surface = android_default_surface,
    onSurface = android_default_onSurface,
    surfaceVariant = android_default_surfaceVariant,
    onSurfaceVariant = android_default_onSurfaceVariant,
    surfaceTint = android_default_surfaceTint,
    inverseSurface = android_default_inverseSurface,
    inverseOnSurface = android_default_inverseOnSurface,
    error = android_default_error,
    onError = android_default_onError,
    errorContainer = android_default_errorContainer,
    onErrorContainer = android_default_onErrorContainer,
    outline = android_default_outline,
    outlineVariant = android_default_outlineVariant,
    scrim = android_default_scrim,
)

@Composable
fun TravelBuddyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> customColorTheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}