import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        jcenter()
        maven { url = uri("https://repo1.maven.org/maven2") }
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.4.0")
    }
}

group = "dev.ufer"
version = "0.1.0"

repositories {
    jcenter()
    maven { url = uri("https://repo1.maven.org/maven2") }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

plugins {
    val kotlinVersion = "1.4.10"
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.springframework.boot") version "2.4.0"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    id("com.diffplug.spotless") version "5.8.2"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
    }
}

repositories {
	maven { url = uri("https://repo1.maven.org/maven2") }
	maven { url = uri("https://repo.spring.io/snapshot") }
	maven { url = uri("https://repo.spring.io/milestone") }
}

spotless {
    kotlin {
        ktlint()
    }
    format("misc") {
        target("**/*.gradle", "**/*.md", "**/*.yml")
        trimTrailingWhitespace()
        endWithNewline()
    }
}
