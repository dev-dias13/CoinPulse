plugins {
    `kotlin-dsl`
}

group = "dev.dias.coinpulse.buildlogic"

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.ksp.gradlePlugin)
    implementation(libs.room.gradlePlugin)
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.60.1")
    implementation("org.jetbrains.kotlin:compose-compiler-gradle-plugin:2.1.0")
}

// tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile>().configureEach {
//     compilerOptions {
//         jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
//     }
// }


gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "coinpulse.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidLibrary") {
            id = "coinpulse.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidCompose") {
            id = "coinpulse.android.compose"
            implementationClass = "AndroidComposeConventionPlugin"
        }
        register("androidHilt") {
            id = "coinpulse.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
        register("androidFeature") {
            id = "coinpulse.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
        register("androidRoom") {
            id = "coinpulse.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }
    }
}
