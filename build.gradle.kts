/*
 * ================================
 *  Main Configuration
 * ================================
 */

plugins {
    java
    antlr
}

group = "neodym"
version = "1.0.0"

val targetGroup = "neodym tasks"

layout.buildDirectory = file("build")

val mainFolder = file("src/main")
val testFolder = file("src/test")
val genFolder = file("src/gen")

repositories {
    mavenCentral()
}

dependencies {
    // ANTLR4
    antlr("org.antlr:antlr4:4.13.1")

    // Lombok
    "1.18.30".let { lombokVersion ->
        preprocessor("org.projectlombok:lombok:$lombokVersion")
        compileTime("org.projectlombok:lombok:$lombokVersion")
    }

    // JUnit
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

sourceSets {
    main {
        java.srcDirs(mainFolder, genFolder)
        resources.srcDirs(mainFolder, genFolder)
    }
    test {
        java.srcDirs(testFolder)
        resources.srcDirs(testFolder)
    }
}

gradle.projectsEvaluated {
    tasks.all {
        if (group != targetGroup) {
            group = "other"
        }
    }
}

/*
 * ================================
 *  Tasks
 * ================================
 */

tasks.processResources {
    includeEmptyDirs = false
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    exclude("**/*.java")
    exclude("neodym/antlr/*")
    include("neodym/antlr/*.java")
    include("neodym/antlr/*.tokens")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.generateGrammarSource {
    group = targetGroup
    maxHeapSize = "128m"
    source = fileTree(mainFolder) {
        include("**/*.g4")
    }
    arguments.addAll("-Werror", "-long-messages", "-package", "neodym.antlr")
    doLast {
        genFolder.deleteRecursively()
        file("build/generated-src/antlr/main").delete()
        fileTree("build/generated-src/antlr") {
            include("**/*.interp")
        }.forEach { it.delete() }
        file("build/generated-src/antlr").renameTo(genFolder)
    }
}

tasks.clean {
    doLast {
        genFolder.deleteRecursively()
    }
}

tasks.compileJava {
    dependsOn(tasks.generateGrammarSource)
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
fun <T> MutableCollection<in T>.addAll(vararg elements: T) { addAll(elements) }