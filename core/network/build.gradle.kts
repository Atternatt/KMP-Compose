plugins {
    alias(libs.plugins.multiplatform)
    id("com.android.library")
    kotlin("plugin.serialization") version "1.9.21"
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
            baseName = "network"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.bundles.network)
                api(project(":core:model"))
                api(libs.bundles.arrow)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.kotlinx.coroutines.android)
            }
        }
        val commonTest by getting {
            dependencies {
//                implementation(kotlin("test"))
            }
        }

        val iosMain by getting {
            dependencies {
                api(libs.ktor.client.darwin)
            }
        }
    }
}

android {
    namespace = "com.m2f.network"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
    dependencies {
        implementation(libs.ktor.client.okhttp)
    }
}