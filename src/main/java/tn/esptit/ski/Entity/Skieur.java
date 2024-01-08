package tn.esptit.ski.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
     Long numSkieur;

     String nomS;
     String prenomS;
     LocalDate dateNaissance;
     String ville;

    //@JsonIgnore
    //on evite JsonIgnore car l'ajout de skieur il faut ajouter abonnement au mm temps dons on a besoin le corps de abonnement
    //cascade elle fait l'affectation automatique lors de l'ajout
    @ToString.Exclude
    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy = "skieurList")
    List<Piste> pisteList=new ArrayList<>();

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "skieur")
    List<Inscription> inscriptionList =new ArrayList<>();

}