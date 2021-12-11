package pl.szeliga.pfenningTest11.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.szeliga.pfenningTest11.model.Markt;
import pl.szeliga.pfenningTest11.service.MarktServis;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
public class MarktController {

    @Autowired
    private final MarktServis marktServis;

    @PostMapping("/markt")
    public Markt addMarkt(@RequestBody Markt markt) {
        return marktServis.addMarkt(markt);
    }

}
