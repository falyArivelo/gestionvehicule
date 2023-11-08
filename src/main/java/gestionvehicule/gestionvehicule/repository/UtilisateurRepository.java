package gestionvehicule.gestionvehicule.repository;

import gestionvehicule.gestionvehicule.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findByEmail(String email);
}