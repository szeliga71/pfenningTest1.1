package pl.szeliga.pfenningTest11.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter // tutaj nie zamienilem na @Data, bo ma to efekty uboczne i jest niepolecane
// reference: https://deinum.biz/2019-02-13-Lombok-Data-Ojects-Arent-Entities/
@Setter
public class DestinationWare {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long tourId;
  private Long marktId;
  private int roli;
  private int palet;
  private int m1;
  private int m2;
  private int m4;
  private int tkBox;
}
