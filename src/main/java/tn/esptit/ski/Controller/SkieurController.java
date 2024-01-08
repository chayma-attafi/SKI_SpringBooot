package tn.esptit.ski.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esptit.ski.Entity.Skieur;
import tn.esptit.ski.Service.Interface.SkieurInterface;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class SkieurController {
    SkieurInterface skieurInterface;

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return skieurInterface.addSkieur(skieur);
    }
}
