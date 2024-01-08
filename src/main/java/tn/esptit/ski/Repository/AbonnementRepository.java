package tn.esptit.ski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esptit.ski.Entity.Abonnement;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}
