package pl.szeliga.pfenningTest11.Controller;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pl.szeliga.pfenningTest11.service.DestinationWareServis;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
public class DestinationWareController {

    @Autowired
    private final DestinationWareServis destinationWareServis;


}
