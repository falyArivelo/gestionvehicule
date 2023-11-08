package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "entretiens")

@NoArgsConstructor
@Getter
@Setter
public class Entretien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEntretien;
    @ManyToOne()
    @JoinColumn(name = "idVehicule")
    Vehicule vehicule;

    @ManyToOne()
    @JoinColumn(name = "idTypeEntretien")
    TypeEntretien typeEntretien;
    LocalDate dateEntretien;
    double cout;
    String description;


}
