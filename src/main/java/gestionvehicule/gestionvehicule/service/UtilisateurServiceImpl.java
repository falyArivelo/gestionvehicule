package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UtilisateurServiceImpl  implements UtilisateurService{

    private List<Utilisateur> utilisateurs = Arrays.asList(
            new Utilisateur("john@gmail.com", "password"),
            new Utilisateur("jane@gmail.com", "password")
    );

    @Override
    public Utilisateur findByEmail(String email) {
        return utilisateurs.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

}
