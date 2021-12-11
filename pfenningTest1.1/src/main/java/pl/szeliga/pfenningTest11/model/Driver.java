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
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idPf;
    private int idRewe;
    private String name;
    private String lastName;
    private String hireDate;
    private String endHire;

    @OneToMany
    @JoinColumn(name = "driverId", updatable = false, insertable = false)
    private List<Tour> tour;


}
