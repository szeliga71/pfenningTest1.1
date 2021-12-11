package pl.szeliga.pfenningTest11.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szeliga.pfenningTest11.model.Driver;
import pl.szeliga.pfenningTest11.repository.DriverRepository;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class DriverService {

  private final DriverRepository driverRepository;

  public Driver addDriver(Driver driver) {
    return driverRepository.save(driver);
  }

  public List<Driver> getAllDriver() {
    return driverRepository.findAll();
  }

  public Driver findByDriverName(String lastName) {
    return driverRepository.findByLastName(lastName);
  }
}
