package gestionvehicule.gestionvehicule.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "assurances")

@NoArgsConstructor
@Getter
@Setter
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAssurance;
    @ManyToOne()
    @JoinColumn(name = "idVehicule")
    Vehicule vehicule;

    @ManyToOne()
    @JoinColumn(name = "idTypeAssurance")
    TypeAssurance typeAssurance;

    @ManyToOne()
    @JoinColumn(name = "idCompagnieAssurance")
    CompagnieAssurance compagnieAssurance;

    LocalDate DateDebutAssurance;

    LocalDate DateExpirationAssurance;

    double montant;


}
