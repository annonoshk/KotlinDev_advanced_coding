plugins {
    kotlin("jvm") version "2.1.0"
    application
    // SQLDelight Plugin
    //kotlin("plugin.serialization") version "2.1.0"
    id("app.cash.sqldelight") version "2.0.2"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.1.10"
}

group = "org.crevolika"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
   // implementation("androidx.constraintlayout:constraintlayout-core:1.1.0")
    val koinVersion = "4.0.1"
    val ktorClientVersion = "3.0.3"
    val ktorVersion = "3.0.3"
    implementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation(kotlin("test"))
    implementation(kotlin("test"))
    testImplementation("io.mockk:mockk:1.13.14")
    testImplementation ("org.jetbrains.kotlin:kotlin-test:1.5.31")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.1.0")
    //runtimeOnly("com.h2database:h2:x.y.zzz")
    // latest version you can find https://firebase.google.com/docs/android/android-play-services
    /*    implementation("com.google.firebase:firebase-firestore-ktx:24.7.0")
    implementation("androidx.core:core-ktx:1.10.1")*/
    implementation("app.cash.sqldelight:sqlite-driver:2.0.2")
    implementation("app.cash.sqldelight:async-extensions:2.0.2")
    implementation("app.cash.sqldelight:coroutines-extensions:2.0.2")
    testImplementation(kotlin("test"))

    implementation("io.insert-koin:koin-core:$koinVersion")

    implementation("org.jetbrains.kotlin:kotlin-reflect:2.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.6")
    implementation ("ch.qos.logback:logback-classic:1.5.16")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")

    // Add the dependency for the Realtime Database library
    // When using the BoM, you don't specify versions in Firebase library dependencies
    // implementation("com.google.firebase:firebase-database-ktx")
    // Add moshi for Json
    implementation("com.squareup.moshi:moshi-kotlin:1.15.2")
    implementation("io.github.khubaibkhan4:mediaplayer-kmp:2.0.5")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
    implementation("com.squareup.retrofit2:retrofit:(insert latest version)")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:1.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
    implementation("io.ktor:ktor-client-core:$ktorClientVersion")
    implementation("io.ktor:ktor-client-cio:$ktorClientVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion") // JSON
    implementation("io.ktor:ktor-client-auth:$ktorVersion")
    implementation("io.ktor:ktor-client-websockets:$ktorVersion")
    implementation("org.jetbrains.kotlinx:atomicfu:0.27.0")
    implementation("io.github.reactivecircus.cache4k:cache4k:0.14.0")
    // MongoDB Kotlin driver dependency
    implementation("org.mongodb:mongodb-driver-kotlin-coroutine:5.3.1")
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.12.0")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-css:2025.1.11")
    implementation("io.ktor:ktor-server-core:3.0.3") // Update to the latest version
    implementation("io.ktor:ktor-server-netty:3.0.3") // Update to the latest version
    implementation("io.ktor:ktor-server-websockets:3.0.3") // Update to the latest version
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.14")

}
tasks.test {
    useJUnitPlatform()

    testLogging  {
        events ("passed", "skipped", "failed")
    }
}

kotlin {
    jvmToolchain(21)
}

// SQLDelight Configuration
sqldelight {
    databases {
        // Schema name
        create("Database") {
            // Package name
            packageName.set("dev.hyperskill.sqldelight")
        }
    }
}

