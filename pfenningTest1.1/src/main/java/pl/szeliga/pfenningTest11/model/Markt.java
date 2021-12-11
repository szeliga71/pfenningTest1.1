package pl.szeliga.pfenningTest11.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Markt {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private int nr;
  private String adres;

  @OneToMany
  @JoinColumn(name = "marktId", updatable = false, insertable = false)
  private List<DestinationWare> destinationWare;
}
