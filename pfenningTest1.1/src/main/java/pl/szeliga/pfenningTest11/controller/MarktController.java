package pl.szeliga.pfenningTest11.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.szeliga.pfenningTest11.model.Markt;
import pl.szeliga.pfenningTest11.service.MarktServis;

@RestController
@RequiredArgsConstructor
public class MarktController {

  private final MarktServis marktServis;

  @PostMapping("/markt")
  public Markt addMarkt(@RequestBody Markt markt) {
    return marktServis.addMarkt(markt);
  }
}
