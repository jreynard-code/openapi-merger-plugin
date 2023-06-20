plugins {
    kotlin("jvm") version "1.8.20"
    id("io.kotest")
    id("org.jetbrains.dokka")
}

java {
    withJavadocJar()
    withSourcesJar()
}

dependencies {
    implementation(kotlin(module = "stdlib"))
    implementation(group = "io.swagger.parser.v3", name = "swagger-parser", version = "2.1.15")
    implementation(group = "org.slf4j", name = "slf4j-api", version = "2.0.7")

    implementation(group = "jakarta.validation", name = "jakarta.validation-api", version = "3.0.2")
    runtimeOnly(group = "org.hibernate.validator", name = "hibernate-validator", version = "8.0.0.Final")
    runtimeOnly(group = "org.hibernate.validator", name = "hibernate-validator-annotation-processor", version = "8.0.0.Final")
    runtimeOnly(group = "jakarta.el", name = "jakarta.el-api", version = "5.0.1")
    runtimeOnly(group = "org.glassfish", name = "jakarta.el", version = "5.0.0-M1")

    testImplementation(group = "io.kotest", name = "kotest-assertions-core-jvm", version = "5.6.2")
    testImplementation(group = "io.kotest", name = "kotest-framework-engine-jvm", version = "5.6.2")
    testImplementation(group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-core", version = "1.7.1")
    testImplementation(group = "io.mockk", name = "mockk", version = "1.13.5")

}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "17"
    }
}


