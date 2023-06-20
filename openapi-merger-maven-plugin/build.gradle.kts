plugins {
    java
}

java {
    withSourcesJar()
    withJavadocJar()
}


val mavenVersion = "3.6.3"
val mavenPluginVersion = "3.6.0"
val eclipseAetherVersion = "1.1.0"
val mavenWagonVersion = "3.4.1"
val lombokVersion = "1.18.28"

dependencies {
    compileOnly(group = "org.projectlombok", name = "lombok", version = lombokVersion)
    annotationProcessor(group = "org.projectlombok", name = "lombok", version = lombokVersion)

    implementation(project(":openapi-merger-app"))
    implementation(group = "org.apache.maven", name = "maven-core", version = mavenVersion)
    implementation(group = "org.apache.maven", name = "maven-plugin-api", version = mavenVersion)
    implementation(group = "org.apache.maven.plugin-tools", name = "maven-plugin-annotations", version = mavenPluginVersion)

    testImplementation("junit", "junit", "4.12")
}

