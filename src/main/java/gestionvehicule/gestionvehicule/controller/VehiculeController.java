package gestionvehicule.gestionvehicule.controller;

import gestionvehicule.gestionvehicule.models.Vehicule;
import gestionvehicule.gestionvehicule.repository.VehiculeRepository;
import gestionvehicule.gestionvehicule.service.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicule")
@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
public class VehiculeController {
    VehiculeService vehiculeService;

    @PostMapping("create")
    public Vehicule create(@RequestBody Vehicule vehicule){
        return  vehiculeService.save(vehicule);
    }
    @GetMapping("list")
    public List<Vehicule> list(){
        return vehiculeService.list();
    }
    @PutMapping("/update/{idVehicule}")
    public Vehicule update(@PathVariable int idVehicule, @RequestBody Vehicule vehicule){
        return vehiculeService.update(idVehicule,vehicule);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int idVehicule){
        return vehiculeService.delete(idVehicule);
    }
}
