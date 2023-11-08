package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "assurances")

@NoArgsConstructor
@Getter
@Setter

public class CompagnieAssurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCompagnieAssurance;
    String nom;
    String adresse;


}
