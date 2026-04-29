plugins {  
    id("com.android.application") version "7.2.1" apply false  
    id("kotlin-android") version "1.6.0" apply false  
}  
  
android {  
    compileSdk = 33  
    defaultConfig {  
        applicationId = "com.example.radiomaximum"  
        minSdk = 21  
        targetSdk = 33  
        versionCode = 1  
        versionName = "1.0"  
    }  
    buildTypes {  
        release {  
            isMinifyEnabled = false  
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")  
        }  
    }  
}  
  
dependencies {  
    implementation("com.google.android.material:material:1.5.0")  
    implementation("androidx.appcompat:appcompat:1.4.1")  
    implementation("androidx.core:core-ktx:1.7.0")  
    implementation("coil-kt:coil:2.0.0")  
    implementation("com.google.android.exoplayer:exoplayer:2.16.1")  
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.0")  
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0")  
}