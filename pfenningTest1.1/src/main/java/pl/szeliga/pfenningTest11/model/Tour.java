package pl.szeliga.pfenningTest11.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Tour {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nrRewe;
  private LocalDate date;
  private int distanceRewe;
  private int distance;
  private LocalDateTime timeStart;
  private LocalDateTime timeEnd;
  private Long truckId;
  private Long driverId;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "tourId") // redundancy: te parametry maja domyslne wartosci 'true'
  private List<DestinationWare> destinationWare;
}
