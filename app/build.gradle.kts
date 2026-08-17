plugins {
    id("coinpulse.android.application")
    id("coinpulse.android.compose")
    id("coinpulse.android.hilt")
}

android {
    namespace = "dev.dias.coinpulse"

    defaultConfig {
        applicationId = "dev.dias.coinpulse"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "dev.dias.coinpulse.HiltTestRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }
}

dependencies {
    implementation(project(":core:network"))
    implementation(project(":core:nav"))
    implementation(project(":uikit"))
    implementation(project(":features:coins"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.hilt.testing)
}
