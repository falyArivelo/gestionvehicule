package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Vehicule;

import java.util.List;

public interface VehiculeService {
    Vehicule save(Vehicule vehicule);

    List<Vehicule> list();

    Vehicule update(int idVehicule,Vehicule vehicule);
    String delete(int idVehicule);

}
