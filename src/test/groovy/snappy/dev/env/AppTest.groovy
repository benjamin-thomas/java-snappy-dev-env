package snappy.dev.env

import groovy.transform.CompileStatic
import spock.lang.Specification

@CompileStatic
class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result == "Hello world!"
    }
}
