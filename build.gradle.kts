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

/*
 * ================================
 *  Tasks
 * ================================
 */

tasks.processResources {
    includeEmptyDirs = false
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    exclude("**/*.java")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.generateGrammarSource {
    maxHeapSize = "128m"
    arguments.addAll("-Werror", "-long-messages")
    

//    val pkg = "neodym.antlr"
//    arguments.addAll("-package", pkg, "-Werror", "-long-messages")
//    outputDirectory = outputDirectory.resolve(pkg.split(".").joinToString("/"))
}

tasks.clean {
    doLast {
        genFolder.deleteRecursively()
    }
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
fun <T> MutableCollection<in T>.addAll(vararg elements: T) {
    addAll(elements)
}
