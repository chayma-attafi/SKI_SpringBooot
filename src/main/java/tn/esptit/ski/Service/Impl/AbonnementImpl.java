package tn.esptit.ski.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esptit.ski.Entity.Abonnement;
import tn.esptit.ski.Repository.AbonnementRepository;
import tn.esptit.ski.Service.Interface.AbonnementInterface;

@AllArgsConstructor
@Service
public class AbonnementImpl implements AbonnementInterface {
    AbonnementRepository abonnementRepository;
    @Override
    public Abonnement AjoutAbonn(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }
}
