plugins {
    id("coinpulse.android.library")
}

android {
    namespace = "dev.dias.coinpulse.core.nav"
}

dependencies {
    implementation(libs.androidx.navigation.compose)
}
