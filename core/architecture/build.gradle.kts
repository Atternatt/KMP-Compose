plugins {
    kotlin("multiplatform")
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
            baseName = "architecture"
        }
    }

    

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                implementation(libs.bundles.arrow)
            }
        }
        val commonTest by getting {
            dependencies {
//                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.m2f.architecture"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
    packaging {
        resources {
            excludes += "**/attach_hotspot_windows.dll"
            excludes += "META-INF/licenses/**"
            excludes += "META-INF/{AL2.0,LGPL2.1}"
        }
    }
}