package pl.szeliga.pfenningTest11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szeliga.pfenningTest11.model.Truck;


@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
}
