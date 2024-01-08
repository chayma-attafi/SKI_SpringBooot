package tn.esptit.ski.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Inscription")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
     Long numInscription;
    int numSemaine;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    Skieur skieur;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    Cours cours;
}
