package tn.esptit.ski.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esptit.ski.Entity.Skieur;
import tn.esptit.ski.Repository.SkieurRepository;
import tn.esptit.ski.Service.Interface.SkieurInterface;

@AllArgsConstructor
@Service
public class SkieurImpl implements SkieurInterface {

    SkieurRepository skieurRepository;
    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }
}
