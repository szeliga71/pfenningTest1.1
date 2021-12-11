package pl.szeliga.pfenningTest11.service;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.szeliga.pfenningTest11.model.Tour;
import pl.szeliga.pfenningTest11.repository.TourRepository;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class TourService {

    public final TourRepository tourRepository;

    public List<Tour> getAllTour() {
        return tourRepository.findAll();
    }

    public Tour addTour(Tour tour) {
        return tourRepository.save(tour);
    }
}
