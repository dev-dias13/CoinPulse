import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

internal const val JVM_TOOLCHAIN_VERSION = 17
internal const val COMPILE_SDK = 37
internal const val MIN_SDK = 26

internal fun Project.configureKotlinAndroid(extension: ApplicationExtension) {
    with(extension) {
        compileSdk = COMPILE_SDK
        defaultConfig {
            minSdk = MIN_SDK
            targetSdk = COMPILE_SDK
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }
    configureJvmToolchain()
}

internal fun Project.configureKotlinAndroid(extension: LibraryExtension) {
    with(extension) {
        compileSdk = COMPILE_SDK
        defaultConfig {
            minSdk = MIN_SDK
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }
    configureJvmToolchain()
}

private fun Project.configureJvmToolchain() {
    extensions.configure<KotlinAndroidProjectExtension> {
        jvmToolchain(JVM_TOOLCHAIN_VERSION)
    }
}
