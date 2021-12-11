package pl.szeliga.pfenningTest11.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.szeliga.pfenningTest11.model.Driver;
import pl.szeliga.pfenningTest11.service.DriverService;

import java.util.List;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
public class DriverController {

    @Autowired
    private final DriverService driverService;

    @GetMapping("driver")
    public List<Driver> getAllDriver() {
        return driverService.getAllDriver();
    }

    @PostMapping("driver")
    public Driver addDriver(@RequestBody Driver driver) {
        return driverService.addDriver(driver);
    }

    @PutMapping("driver")
    public void updateDriver(@RequestBody Driver driver) {
    }

}
