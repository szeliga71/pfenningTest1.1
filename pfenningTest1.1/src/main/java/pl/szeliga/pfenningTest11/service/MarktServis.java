package pl.szeliga.pfenningTest11.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
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
