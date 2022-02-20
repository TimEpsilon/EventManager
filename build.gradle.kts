/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    java
    `maven-publish`
    id("io.papermc.paperweight.userdev") version "1.3.3"
}

repositories {
    jcenter()
    mavenCentral()
    mavenLocal()
    maven {
        url = uri("https://papermc.io/repo/repository/maven-public/")
    }

    maven {
        url = uri("https://jitpack.io")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }

    maven {
        url = uri("https://mvn.intellectualsites.com/content/groups/public/")
    }

}

dependencies {
    compileOnly("com.fastasyncworldedit:FAWE-Core:1.17-157")
    compileOnly("com.fastasyncworldedit:FAWE-Bukkit:1.17-157")
    paperDevBundle("1.18.1-R0.1-SNAPSHOT")
}

group = "com.github.Tim91690"
version = "1.0-SNAPSHOT"
description = "EventManager"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}