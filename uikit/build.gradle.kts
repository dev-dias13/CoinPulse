plugins {
    id("coinpulse.android.library")
    id("coinpulse.android.compose")
}

android {
    namespace = "dev.dias.coinpulse.ui"
}

dependencies {
    api(platform(libs.androidx.compose.bom))
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.ui)
    api(libs.androidx.compose.ui.tooling.preview)
    debugApi(libs.androidx.compose.ui.tooling)
}
