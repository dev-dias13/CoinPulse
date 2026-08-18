plugins {
    id("coinpulse.android.library")
    id("coinpulse.android.compose")
}

android {
    namespace = "dev.dias.coinpulse.core.nav"
}

dependencies {
    api(libs.androidx.navigation3.runtime)
    api(libs.androidx.navigation3.ui)
    api(libs.androidx.lifecycle.viewmodel.navigation3)
}
