package pl.szeliga.pfenningTest11.controller;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.szeliga.pfenningTest11.model.Truck;
import pl.szeliga.pfenningTest11.service.TruckServis;

import java.util.List;

@RestController
@Data
@RequiredArgsConstructor
public class TruckController {

    @Autowired
    private final TruckServis truckServis;

    @GetMapping("truck/all")
    public List<Truck> getAllTrucks() {
        return truckServis.getAllTrucks();
    }

    @PostMapping("/truck")
    public Truck addTruck(@RequestBody Truck truck) {
        return truckServis.addTruck(truck);
    }
}
