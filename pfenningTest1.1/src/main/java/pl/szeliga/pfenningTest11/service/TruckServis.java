package pl.szeliga.pfenningTest11.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.szeliga.pfenningTest11.model.Truck;
import pl.szeliga.pfenningTest11.repository.TruckRepository;

import java.util.List;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class TruckServis {

    @Autowired
    private final TruckRepository truckRepository;

    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public Truck addTruck(Truck truck) {
        return truckRepository.save(truck);
    }
}
