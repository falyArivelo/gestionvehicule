package gestionvehicule.gestionvehicule.controller;

import gestionvehicule.gestionvehicule.models.TypeVehicule;
import gestionvehicule.gestionvehicule.models.Utilisateur;
import gestionvehicule.gestionvehicule.service.TypeVehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/typevehicule")
@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
public class TypeVehiculeController {
    TypeVehiculeService typeVehiculeService;

    @PostMapping("create")
    public TypeVehicule create(@RequestBody TypeVehicule typeVehicule){
        return  typeVehiculeService.create(typeVehicule);
    }
}
