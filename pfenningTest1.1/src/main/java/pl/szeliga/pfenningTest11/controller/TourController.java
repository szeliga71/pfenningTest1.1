package pl.szeliga.pfenningTest11.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
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
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class TourController {

@Autowired
private final DriverService driverService;

    @Autowired
    private final TourService tourService;

    @Autowired
    private final DestinationWareServis destinationWareServis;

    @Autowired
    ObjectMapper objectMapper;


    @GetMapping("/tour/all")
    public List<Tour> getAllTour(){
        return tourService.getAllTour();
    }


    @PostMapping("tour")
    public Tour addTour(@RequestBody Tour tour){
        return tourService.addTour(tour);
    }


   @PostMapping("/tour/destination")
    public ResponseEntity addTourDestination(@RequestHeader ("driver") String lastName, @RequestBody Tour tourBody, DestinationWare destinationBody){
        Driver driverfromDB = (Driver) driverService.findByDriverName(lastName);

        if(driverfromDB==null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        tourService.addTour(tourBody);
       destinationWareServis.addDestinationWare(destinationBody);
    return (ResponseEntity) ResponseEntity.ok(); }



}
