package pl.szeliga.pfenningTest11.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.szeliga.pfenningTest11.model.Truck;
import pl.szeliga.pfenningTest11.service.TruckServis;

import java.util.List;

/**
 * musisz pamietac o obslusze bledow, zeby komukat zwrotny zawieral cos rozsaadnego obecnie jak na
 * endpoint http://localhost:8080/truck wyslesz POSTa { "xxxplate": "dupa" } to wynik bedzie malo
 * czytalny dla kogos kto korzysta z komponentu:
 *
 * <p>{ "timestamp": "2021-12-11T17:54:29.880+00:00", "status": 500, "error": "Internal Server
 * Error", "path": "/truck" }
 *
 * <p>niezly art o tym ttps://www.baeldung.com/exception-handling-for-rest-with-spring
 *
 * <p>dla ulatwienia, tutaj zrobile globalenie w klasie AllControllersAdvice
 */
@RestController
@RequiredArgsConstructor
public class TruckController {

  private final TruckServis truckServis;

  @GetMapping("truck/all")
  public List<Truck> getAllTrucks() {
    return truckServis.getAllTrucks();
  }

  @PostMapping("/truck")
  public Truck addTruck(@RequestBody Truck truck) {
    //taka uwaga ogolna - nienajlepsza praktyka jest przyjmowanie Entity jako argumentu w endpoincie,
    // lepiej miec klase posrednia model.Truck i potem mapper mode -> entity
    return truckServis.addTruck(truck);
  }
}
