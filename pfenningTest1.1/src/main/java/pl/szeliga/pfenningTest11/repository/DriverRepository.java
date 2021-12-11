package pl.szeliga.pfenningTest11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szeliga.pfenningTest11.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

  Driver findByLastName(String lastName);
}
