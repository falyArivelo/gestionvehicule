package gestionvehicule.gestionvehicule.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "TypeVehicules")

@NoArgsConstructor

public class TypeVehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idTypeVehicule;
    String type;
    @OneToMany(mappedBy = "typeVehicule")
    private Set<Vehicule> vehicules;



    public int getIdTypeVehicule() {
        return idTypeVehicule;
    }

    public void setIdTypeVehicule(int idTypeVehicule) {
        this.idTypeVehicule = idTypeVehicule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
