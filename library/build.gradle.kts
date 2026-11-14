import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
}

group = "dev.kinkle"
version = "0.1.0"

kotlin {
    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
        }
    }

    android {
        namespace = "dev.kinkle.digest"
        compileSdk = 36
        minSdk = 24

        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
        }
    }
}
