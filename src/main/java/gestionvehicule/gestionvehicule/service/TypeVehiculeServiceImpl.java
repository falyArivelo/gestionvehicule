package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.TypeVehicule;
import gestionvehicule.gestionvehicule.repository.TypeVehiculeRepository;
import gestionvehicule.gestionvehicule.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TypeVehiculeServiceImpl implements  TypeVehiculeService{
    TypeVehiculeRepository typeVehiculeRepository;
    @Override
    public TypeVehicule create(TypeVehicule typeVehicule) {
        return typeVehiculeRepository.save(typeVehicule);
    }
}
