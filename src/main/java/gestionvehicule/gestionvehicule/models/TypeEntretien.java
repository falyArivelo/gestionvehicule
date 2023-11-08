package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "typeentretiens")

@NoArgsConstructor
@Getter
@Setter
public class TypeEntretien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idTypentretien;
    String type;
}
