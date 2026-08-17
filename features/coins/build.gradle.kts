plugins {
    id("coinpulse.android.feature")
    id("coinpulse.android.compose")
}

android {
    namespace = "dev.dias.coinpulse.features.coins"
}

dependencies {
    implementation(project(":core:network"))
    // Add other dependencies as needed
}
