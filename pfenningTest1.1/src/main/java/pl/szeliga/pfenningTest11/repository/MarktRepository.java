package pl.szeliga.pfenningTest11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szeliga.pfenningTest11.model.Markt;


@Repository
public interface MarktRepository extends JpaRepository<Markt,Long> {
}
