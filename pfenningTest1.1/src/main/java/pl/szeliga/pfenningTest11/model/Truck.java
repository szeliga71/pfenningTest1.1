package pl.szeliga.pfenningTest11.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Truck {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String plate;

  @OneToMany
  @JoinColumn(updatable = false, insertable = false)
  private List<Tour> tour;
}
