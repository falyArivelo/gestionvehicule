package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehicules")

@NoArgsConstructor
@Getter
@Setter
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVehicule;
    @ManyToOne
    @JoinColumn(name = "idTypeVehicule")
    TypeVehicule typeVehicule;
    String marque;
    String modele;
    @Column(length = 50)
    String immatriculation;
    int annee;
    String typeCarburant;

}
