package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Utilisateur;
import gestionvehicule.gestionvehicule.repository.UtilisateurRepository;
import gestionvehicule.gestionvehicule.repository.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl  implements UtilisateurService{

    UtilisateurRepository utilisateurRepository;

    private List<Utilisateur> utilisateurs = Arrays.asList(
            new Utilisateur("john@gmail.com", "password"),
            new Utilisateur("jane@gmail.com", "password")
    );

    @Override
    public Utilisateur create(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur findByEmail(String email) {
        return utilisateurs.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

}
