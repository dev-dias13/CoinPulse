package dev.dias.coinpulse.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class MarketColors(
    val priceUp: Color,
    val priceDown: Color,
    val priceFlat: Color,
)

internal val marketColorsLight = MarketColors(
    priceUp = Color(0xFF00C853),
    priceDown = Color(0xFFFF5252),
    priceFlat = Color(0xFF757575),
)

internal val marketColorsDark = MarketColors(
    priceUp = Color(0xFF00E676),
    priceDown = Color(0xFFFF5252),
    priceFlat = Color(0xFFBDBDBD),
)

val LocalMarketColors = staticCompositionLocalOf { marketColorsLight }

object AppTheme {
    val market: MarketColors
        @Composable
        @ReadOnlyComposable
        get() = LocalMarketColors.current
}
