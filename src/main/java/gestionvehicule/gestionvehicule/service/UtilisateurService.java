package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Utilisateur;
import gestionvehicule.gestionvehicule.models.Vehicule;

public interface UtilisateurService {
    Utilisateur create(Utilisateur utilisateur);
    Utilisateur findByEmail(String email);


}
