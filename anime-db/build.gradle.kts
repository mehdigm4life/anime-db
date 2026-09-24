plugins {
    kotlin("jvm")
    id("maven-publish")
    id("java-library")
}

group = "com.mehdigm"
version = "1.1.0"

publishing {
    repositories {
        mavenLocal()
    }
    publications {
        create<MavenPublication>("jitpack") {
            groupId = "com.github.mehdigm4life"
            artifactId = "animedb"
            version = "1.1.0"
            from(components["java"])
        }
        create<MavenPublication>("maven") {
            groupId = "com.mehdigm"
            artifactId = "animedb"
            version = "1.1.0"
            from(components["java"])
        }
    }
}



repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}
