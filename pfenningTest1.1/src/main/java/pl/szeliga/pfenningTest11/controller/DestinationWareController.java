package pl.szeliga.pfenningTest11.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import pl.szeliga.pfenningTest11.service.DestinationWareServis;

@RestController
@RequiredArgsConstructor
public class DestinationWareController {

  private final DestinationWareServis destinationWareServis;
}
