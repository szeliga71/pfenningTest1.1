package pl.szeliga.pfenningTest11.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szeliga.pfenningTest11.model.DestinationWare;
import pl.szeliga.pfenningTest11.repository.DestinationWareRepository;


@Service
@Getter
@RequiredArgsConstructor
public class DestinationWareServis {

    public final DestinationWareRepository destinationWareRepository;

    public void addDestinationWare(DestinationWare destinationBody) {
        destinationWareRepository.save(destinationBody);
    }
}
