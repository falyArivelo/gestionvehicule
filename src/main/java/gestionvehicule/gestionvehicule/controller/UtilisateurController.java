package gestionvehicule.gestionvehicule.controller;

import gestionvehicule.gestionvehicule.models.Utilisateur;
import gestionvehicule.gestionvehicule.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicule")
@AllArgsConstructor
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String motDePasse, Model model) {
        Utilisateur utilisateur = utilisateurService.findByEmail(email);
        if (utilisateur != null && utilisateur.getMotDePasse().equals(motDePasse)) {
            model.addAttribute("email", email);
            return "welcome";
        } else {
            model.addAttribute("error", "Identifiants invalides");
            return "login";
        }
    }

}
