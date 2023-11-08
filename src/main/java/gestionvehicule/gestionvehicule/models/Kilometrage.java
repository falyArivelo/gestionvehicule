package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "kilometrages")

@NoArgsConstructor
@Getter
@Setter
public class Kilometrage {
    int idTrajet;

    LocalDateTime dateDepart;
    LocalDateTime dateArrivee;
    int kilometrageDepart;
    int kilometrageArrivee;
    int duree;

}
