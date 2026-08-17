plugins {
    id("coinpulse.android.library")
    id("coinpulse.android.hilt")
    kotlin("plugin.serialization")
}

android {
    namespace = "dev.dias.coinpulse.core.network"
}

dependencies {
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.okhttp.logging)
    implementation(libs.kotlinx.serialization.json)
}
