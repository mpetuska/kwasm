# KWASM

A sample setup for the new Kotlin/WASM project that landed in Kotlin 1.7 (unannounced and VERY experimental)

## Usage
```bash
google-chrome --js-flags="--experimental-wasm-typed-funcref --experimental-wasm-gc"
./gradlew wasmBrowserRun

./gradlew wasmBrowserDistribution
ls build/distributions/
```