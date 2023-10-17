/*
 * ================================
 *  Main Configuration
 * ================================
 */

plugins {
    java
}

group = "neodym"
version = "1.0.0"

layout.buildDirectory = file("build")

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

tasks.processResources {
    includeEmptyDirs = false
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}


/*
 * ================================
 *  Tasks
 * ================================
 */

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}


/*
 * ================================
 *  Extension methods
 * ================================
 */

fun DependencyHandlerScope.preprocessor(dependency: String) {
    annotationProcessor(dependency)
    testAnnotationProcessor(dependency)
}
fun DependencyHandlerScope.compileTime(dependency: String) {
    compileOnly(dependency)
    testImplementation(dependency)
}
