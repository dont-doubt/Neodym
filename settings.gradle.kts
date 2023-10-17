/*
 * ================================
 *  Out-of-subprojects Settings
 * ================================
 *
 * FooJay repository allows you to automatically download targetting JDK if it absents
 */

@file:Suppress("UnstableApiUsage")

import org.gradle.toolchains.foojay.FoojayToolchainResolver

plugins {
    id("org.gradle.toolchains.foojay-resolver") version "0.5.0"
}

rootProject.name = "Neodym"

toolchainManagement.jvm.javaRepositories.repository("foojay") {
    resolverClass.set(FoojayToolchainResolver::class.java)
}

