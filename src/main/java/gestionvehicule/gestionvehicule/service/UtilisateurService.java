package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Utilisateur;

public interface UtilisateurService {
    Utilisateur findByEmail(String email);
}
