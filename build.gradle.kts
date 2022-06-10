plugins {
    kotlin("multiplatform") version "1.7.0"
}

repositories {
    mavenCentral()
}

kotlin {
    wasm {
        browser {
            binaries.executable()
        }
    }
}

tasks {
    named("wasmBrowserDistribution") {
        doLast {
            copy {
                from(named("wasmProductionExecutableCompileSync"))
                include("*.wasm")
                into(buildDir.resolve("distributions"))
            }
        }
    }
}