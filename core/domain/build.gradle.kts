plugins {
    alias(libs.plugins.multiplatform)
    id("com.android.library")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
                freeCompilerArgs = freeCompilerArgs + listOf(
                    "-Xcontext-receivers"
                )
            }
        }
    }

    js {
        browser()
        binaries.executable()
    }

    listOf(
        
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "domain"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                implementation(project(":core:model"))
                implementation(project(":core:network"))

                implementation(libs.bundles.arrow)
            }
        }
    }
}

android {
    namespace = "com.m2f.domain"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}