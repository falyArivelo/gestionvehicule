package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "chauffeurs")

@NoArgsConstructor
@Getter
@Setter

public class Chauffeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idChauffeur;
    String nom;
    String prenom;
    LocalDate dateNaissance;
    String numeroPermis;
    String adresse;

}
