package ${packageName}

import grails.testing.mixin.integration.Integration
import grails.testing.spock.OnceBefore
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

/**
 * See https://docs.micronaut.io/latest/guide/index.html#httpClient for documentation about Micronaut HTTP Client.
 */
@Integration
class ${className}Spec extends Specification {

    @Shared
    @AutoCleanup
    HttpClient client

    @OnceBefore
    void init() {
        String baseUrl = "http://localhost:$serverPort"
        this.client  = HttpClient.create(new URL(baseUrl))
    }

    void "test something"() {
        when:
        HttpResponse<String> rsp = this.client.toBlocking().exchange(HttpRequest.GET("/"), String)

        then:
        noExceptionThrown()
        rsp.status() == HttpStatus.OK
    }
}
