package gestionvehicule.gestionvehicule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "trajets")

@NoArgsConstructor

public class Trajet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int idTrajet;
    @ManyToOne
    @JoinColumn(name = "idVehicule")
     Vehicule vehicule;
    @ManyToOne
    @JoinColumn(name = "idChauffeur")
     Chauffeur chauffeur;

    int KilometrageDebut;
    int KilometrageFin;
    LocalDateTime DateDepart;
    LocalDateTime DateArrivee;
     boolean trajetValide;

    public int getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(int idTrajet) {
        this.idTrajet = idTrajet;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    public int getKilometrageDebut() {
        return KilometrageDebut;
    }

    public void setKilometrageDebut(int kilometrageDebut) {
        KilometrageDebut = kilometrageDebut;
    }

    public int getKilometrageFin() {
        return KilometrageFin;
    }

    public void setKilometrageFin(int kilometrageFin) {
        KilometrageFin = kilometrageFin;
    }

    public LocalDateTime getDateDepart() {
        return DateDepart;
    }

    public void setDateDepart(LocalDateTime dateDepart) {
        DateDepart = dateDepart;
    }

    public LocalDateTime getDateArrivee() {
        return DateArrivee;
    }

    public void setDateArrivee(LocalDateTime dateArrivee) {
        DateArrivee = dateArrivee;
    }

    public boolean isTrajetValide() {
        return trajetValide;
    }

    public void setTrajetValide(boolean trajetValide) {
        this.trajetValide = trajetValide;
    }
}
