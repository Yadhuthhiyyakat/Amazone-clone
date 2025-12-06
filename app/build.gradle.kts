plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.amazon"
    compileSdk = 36
    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.example.amazon"
        minSdk = 33
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // --- STABLE, ALIGNED DEPENDENCIES ---
    implementation("androidx.core:core-ktx:1.9.0") // Use a stable core version
    implementation("androidx.appcompat:appcompat:1.6.1") // Stable and compatible
    implementation("androidx.activity:activity-ktx:1.8.0") // Use the -ktx version
    implementation("com.google.android.material:material:1.11.0") // The latest stable M2
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Standard stable version
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation ("com.google.android.material:material:1.12.0")
    // ... your test dependencies
}
