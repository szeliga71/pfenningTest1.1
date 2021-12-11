package pl.szeliga.pfenningTest11.model;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String plate;

    @OneToMany
    @JoinColumn(name = "tourId", updatable = false, insertable = false)
    private List<Tour> tour;

}
