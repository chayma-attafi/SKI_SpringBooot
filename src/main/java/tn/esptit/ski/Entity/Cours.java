package tn.esptit.ski.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Cours")
public class Cours  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numCours")
     Long numCours;
     Integer niveau;
    @Enumerated(EnumType.STRING)
     TypeCours typeCours;
    @Enumerated(EnumType.STRING)
     Support support;
     float prix;
     Integer creneau;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "cours")
    List<Inscription> inscriptionList =new ArrayList<>();

}
