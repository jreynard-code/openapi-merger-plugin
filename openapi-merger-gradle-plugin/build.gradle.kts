plugins {
    kotlin("jvm") version "1.8.20"
    `java-gradle-plugin`
    id("io.kotest")
    id("org.jetbrains.dokka")
}

java {
    withJavadocJar()
    withSourcesJar()
}

dependencies {
    implementation(kotlin(module = "stdlib"))
    implementation(project(":openapi-merger-app"))

    testImplementation(group = "io.kotest", name = "kotest-assertions-core-jvm", version = "4.3.1")
    testImplementation(group = "io.kotest", name = "kotest-framework-engine-jvm", version = "4.3.1")
    testImplementation(group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-core", version = "1.4.1")
    implementation("jakarta.inject:jakarta.inject-api:2.0.1")

}


tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "17"
    }
}
