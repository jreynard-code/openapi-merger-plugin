plugins {
    kotlin("jvm") version "1.8.20" apply false
    id("io.kotest") version "0.2.6" apply false
    id("org.jetbrains.dokka") version "1.4.10.2" apply false
}

val localRepository = "$buildDir/openapi-repo"

allprojects {

    project.extra["localRepository"] = localRepository

    repositories {
        mavenCentral()
    }

}

subprojects {
    apply(plugin = "java")
    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
