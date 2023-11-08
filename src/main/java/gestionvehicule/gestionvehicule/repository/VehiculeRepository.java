package gestionvehicule.gestionvehicule.repository;

import gestionvehicule.gestionvehicule.models.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule,Integer> {
}
