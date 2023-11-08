package gestionvehicule.gestionvehicule.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TypeVehicules")

@NoArgsConstructor
@Getter
@Setter
public class TypeVehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idTypeVehicule;
    String type;

}
