package pl.szeliga.pfenningTest11.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szeliga.pfenningTest11.model.Truck;
import pl.szeliga.pfenningTest11.repository.TruckRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TruckServis {

  private final TruckRepository truckRepository;

  public List<Truck> getAllTrucks() {
    return truckRepository.findAll();
  }

  public Truck addTruck(Truck truck) {
    return truckRepository.save(truck);
  }
}
