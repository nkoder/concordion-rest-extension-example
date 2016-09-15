# concordion-rest-extension-example

## Demo
[http://nkoder.github.io/concordion-rest-extension-example/](http://nkoder.github.io/concordion-rest-extension-example/)

## How to work with specification

1. `./gradlew clean`
2. `./gradlew --continuous test`: run tests and rerun them on every change
3. Open `./build/reports/concordion/index.html`
   in a web browser and refresh every time you expect results to change.
   This page is recreated on every test run. Be aware that to make it work
   failed tests have to be ignored. Therefore `./gradlew test` will return exit code `0`
   even for tests' failures.
4. `./gradlew publishGhPages`: publish last test results on 
   [GitHub Pages](https://nkoder.github.io/concordion-rest-extension-example)