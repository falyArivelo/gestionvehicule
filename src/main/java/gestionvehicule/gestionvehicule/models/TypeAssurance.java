package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "typeassurances")

@NoArgsConstructor
@Getter
@Setter
public class TypeAssurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idTypeAssurance;
    String type;

    @OneToMany(mappedBy = "typeAssurance")
    private Set<Assurance> assurances;
}
