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
@Table(name = "Piste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numPiste")
     Long numPiste;
     String nomPiste;
    @Enumerated(EnumType.STRING)
     Couleur couleur;
     Integer longeur;
     Integer pente;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany
    List<Skieur> skieurList=new ArrayList<>();

}

