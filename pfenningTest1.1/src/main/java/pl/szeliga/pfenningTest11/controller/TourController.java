package pl.szeliga.pfenningTest11.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.szeliga.pfenningTest11.model.DestinationWare;
import pl.szeliga.pfenningTest11.model.Driver;
import pl.szeliga.pfenningTest11.model.Tour;
import pl.szeliga.pfenningTest11.service.DestinationWareServis;
import pl.szeliga.pfenningTest11.service.DriverService;
import pl.szeliga.pfenningTest11.service.TourService;

import java.util.List;

@RestController
@Data
@RequiredArgsConstructor
public class TourController {

    private final DriverService driverService;

    private final TourService tourService;

    private final DestinationWareServis destinationWareServis;

    ObjectMapper objectMapper;


    @GetMapping("/tour/all")
    public List<Tour> getAllTour() {
        return tourService.getAllTour();
    }


    @PostMapping("tour")
    public Tour addTour(@RequestBody Tour tour) {
        return tourService.addTour(tour);
    }


    @PostMapping("/tour/destination")
    public ResponseEntity addTourDestination(@RequestHeader("driver") String lastName, @RequestBody Tour tourBody, DestinationWare destinationBody) {
        Driver driverfromDB = driverService.findByDriverName(lastName);

        if (driverfromDB == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        tourService.addTour(tourBody);
        destinationWareServis.addDestinationWare(destinationBody);
        return ResponseEntity.ok().build();
    }


}
