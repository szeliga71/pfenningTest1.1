package pl.szeliga.pfenningTest11.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.test.annotation.DirtiesContext
import pl.szeliga.pfenningTest11.model.Truck
import spock.lang.Specification

@DataJpaTest
class TruckRepositoryTest extends Specification {

    @Autowired
    TruckRepository truckRepository

    def 'test ze dziala'() {
        given:
        def anotherTruck = new Truck().tap {
            it.plate = 'DW 50098'
            it.tour = ([] as List)
        }

        when:
        def addedTruck = truckRepository.save(anotherTruck)

        then:
        addedTruck.id != null // czyli dostal przydzielone z automatu
        truckRepository.findAll().size() == 7 // zobacz, sam zaciagnal co masz w data.sql, tam bylo 6, dodales nowy i jest 7
    }

    def 'kaboom czernobyl'() {
        given:
        def anotherTruck = new Truck() // pusto, a nie lyknie bez tablicy

        when:
        truckRepository.save(anotherTruck)

        then:
        def ex = thrown(DataIntegrityViolationException)
        ex.message == 'could not execute statement; SQL [n/a]; constraint [null]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement'
    }
}
