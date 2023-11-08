package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "trajets")

@NoArgsConstructor
@Getter
@Setter
public class Trajet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrajet;
    @OneToOne
    @JoinColumn(name = "idVehicule", unique = true)
    private Vehicule vehicule;
    @ManyToOne
    @JoinColumn(name = "idChauffeur")
    private Chauffeur chauffeur;
    int KilometrageDebut;
    int KilometrageFin;
    LocalDateTime DateDepart;
    LocalDateTime DateArrivee;
    private boolean trajetValide;
}
