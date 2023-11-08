package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Vehicule;
import gestionvehicule.gestionvehicule.repository.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.*;
import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements VehiculeService{
    VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule save(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> list() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule update(int idVehicule, Vehicule vehicule) {
        return vehiculeRepository.findById(idVehicule).map(v->{
            v.setNom(vehicule.getNom());
            v.setNumero(vehicule.getNumero());
            return  vehiculeRepository.save(v);
        }).orElseThrow(()-> new RuntimeException("Vehicule non trouvé !"));
    }

    @Override
    public String delete(int idVehicule) {
        vehiculeRepository.deleteById(idVehicule);
        return "produit supprimer !";
    }
}
