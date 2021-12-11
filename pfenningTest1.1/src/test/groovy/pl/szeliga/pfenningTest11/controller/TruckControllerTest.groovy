package pl.szeliga.pfenningTest11.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

// opcji na testowanie tego jest wiele, tutaj tak dla przykladu jeden z prostszych
// https://spring.io/guides/gs/testing-web/
// https://www.baeldung.com/spring-spock-testing
@SpringBootTest(webEnvironment = RANDOM_PORT)
@AutoConfigureMockMvc
class TruckControllerTest extends Specification {
    @LocalServerPort
    private int port

    @Autowired
    private TestRestTemplate restTemplate

    // ten sie spie, przez JoinColumn w jenej z klas, ale nie moge teraz tego sprawdzic
    def 'get zwykly'() {
        given:
        def requestUrl = "http://localhost:$port/truck/all"
        when:
        def response = restTemplate.getForObject(requestUrl, String)
        then:
        response == 'sss'
    }
}
