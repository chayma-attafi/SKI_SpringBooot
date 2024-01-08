package tn.esptit.ski.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esptit.ski.Entity.Abonnement;
import tn.esptit.ski.Service.Interface.AbonnementInterface;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class AbonnementController  {
    AbonnementInterface abonnementInterface;

    @PostMapping("/AjoutAbonn")
    public Abonnement AjoutAbonn(@RequestBody Abonnement abonnement) {
        return abonnementInterface.AjoutAbonn(abonnement);
    }
}
