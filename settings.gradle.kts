pluginManagement {
    repositories {
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/") }
        maven { url = uri("https://repo.spring.io/milestone") }
        gradlePluginPortal()
    }
}

plugins {
//    id("io.micronaut.platform.catalog") version "4.3.4-SNAPSHOT"
    id("com.gradle.develocity") version "4.1.1"
}

rootProject.name = "demo"

develocity {
    server = "https://ge.solutions-team.gradle.com"
}