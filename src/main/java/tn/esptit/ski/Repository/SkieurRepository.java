package tn.esptit.ski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esptit.ski.Entity.Skieur;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur,Long> {
}
