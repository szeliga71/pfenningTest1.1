package pl.szeliga.pfenningTest11.service;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.szeliga.pfenningTest11.model.Markt;
import pl.szeliga.pfenningTest11.repository.MarktRepository;

@Service
@Data
@RequiredArgsConstructor
public class MarktServis {

    private final MarktRepository marktRepository;

    public Markt addMarkt(Markt markt) {
        return marktRepository.save(markt);
    }
}
