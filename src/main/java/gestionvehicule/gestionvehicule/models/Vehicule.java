package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "vehicules")

@NoArgsConstructor
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

    @OneToMany(mappedBy = "vehicule")
    private Set<Trajet> trajets;

    @OneToMany(mappedBy = "vehicule")
    private Set<Assurance> assurances;

    @OneToMany(mappedBy = "vehicule")
    private Set<Entretien> entretiens;

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public TypeVehicule getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(TypeVehicule typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }
}
