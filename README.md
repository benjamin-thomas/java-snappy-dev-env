## Quick setup

    cd myproj
    degit benjamin-thomas/java-snappy-dev-env
    sdk env

Then go to: [How to use](#how-to-use)

---

## Preamble

Run and test java code in **milliseconds**.

This works by leveraging a very cool project: [GroovyServ](https://kobo.github.io/groovyserv/quickstart.html).

And using `Groovy` as an entrypoint for `Java` focused development, coupled with a continuous compilation process
via a file watcher.

For the moment, I "pollute" the file hierarchy with compiled `*.class` files in place. A minor nuisance
counterbalanced by the fact that it makes the continuous compilation process more obvious and "in your face". Git
ignoring them seems to be sufficient for now.

---

## Requirements

Linux only for now. MacOS could work easily but would need a custom file watcher.

### Make sure both groovy versions match

- ./gradlew --version
- groovy --version

### Use Java 8

    java -version

Java 11 would work easily with minute tweaks.

But Groovy 2x with Java 11 prints annoying illegal reflection access warnings.

Also, spock framework's groovy 3 support is too recent and breaks the default `gradlew test` task.

So trying to switch to Java 11 does not seem worth the effort.

---

## How to use

Start or restart the watcher when adding new classes

    - ./gradlew vendorTestJars
    - ./manage/dev/watch

Then run the app

    ./manage/dev/run

Or run some tests

    ./manage/dev/test-run ./src/test/groovy/snappy/dev/env/AppTest.groovy
    
---

Better yet, to focus on a single test use this:

    find src/ -name *.java -o -name *.groovy | entr ./manage/dev/test-run
