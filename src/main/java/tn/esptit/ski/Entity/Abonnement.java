package tn.esptit.ski.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Abonnement")
public class Abonnement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numAbon")
     Long numAbon;

     LocalDate dateDebut;
     LocalDate dateFin;
     float prixAbon;
    @Enumerated(EnumType.STRING)
     TypeAbonnement typeAbon;

}
