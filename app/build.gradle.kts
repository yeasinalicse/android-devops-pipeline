plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    signingConfigs {
        getByName("debug") {
            storeFile =
                file("/Users/yeasin/yeasin_soft/android/test/android-devops-pipeline/key.jks")
            storePassword = "123456"
            keyAlias = "key"
            keyPassword = "123456"
        }
        create("release") {
            storeFile =
                file("/Users/yeasin/yeasin_soft/android/test/android-devops-pipeline/key.jks")
            storePassword = "123456"
            keyPassword = "123456"
            keyAlias = "key"
        }
    }
    namespace = "info.yeasin.androiddevopspipeline"
    compileSdk = 36

    defaultConfig {
        applicationId = "info.yeasin.androiddevopspipeline"
        minSdk = 24
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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}