package pl.szeliga.pfenningTest11.service

import pl.szeliga.pfenningTest11.model.Truck
import pl.szeliga.pfenningTest11.repository.TruckRepository
import spock.lang.Specification

/**
 * przyklad testu jednostkowego - nie gada z prawdziwym repozytorium, tylko z mockiem
 * srednio to wyjasninli ale generalny koncept: https://pl.wikipedia.org/wiki/Test_jednostkowy
 */
class TruckServisUnitTest extends Specification {
    static final TEST_TRUCKS = [ new Truck(), new Truck() ] as List
    TruckRepository truckRepository = Mock()
    TruckServis truckServis = new TruckServis(truckRepository)

    def 'getAllTrucks'() {
        // given when then, to modna koncepcja dla TDD - test driven development, krociutkie info https://en.wikipedia.org/wiki/Given-When-Then
        // teorteycznie (nie zawsze sie tak da w praktyce, ale na rozmowie kwalifikacynej warto powiedziec) - NAJPIERW piszesz testy
        // a potem implementacje az Twoje testy beda zielone, ciut wiecej: https://pl.wikipedia.org/wiki/Test-driven_development
        // given wystepuje nie zawsze, ale w wiekszosci przypadkow, gdy zlozonosc jest wyzsza - jak najbardziej
        when:
        def result = truckServis.getAllTrucks()
        then:
        1 * truckRepository.findAll() >> TEST_TRUCKS
        result == TEST_TRUCKS
    }

    def 'addTruck'() {
    }
}
