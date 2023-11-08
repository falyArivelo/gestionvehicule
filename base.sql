CREATE TABLE TypeVehicules(
    idTypeVehicule SERIAL PRIMARY KEY,
    type varchar(255)
);

CREATE TABLE Vehicules (
    idVehicule SERIAL PRIMARY KEY,
    idTypeVehicule int,
    marque VARCHAR(255),
    modele VARCHAR(255),
    immatriculation VARCHAR(255),
    annee INTEGER,
    TypeCarburant VARCHAR(50)
);

CREATE TABLE Chauffeurs (
    idChauffeur SERIAL PRIMARY KEY,
    nom VARCHAR(255),
    prenom VARCHAR(255),
    dateNaissance DATE,
    numeroPermis VARCHAR(20),
    adresse varchar(200)
);

CREATE TABLE Trajets (
    idTrajet SERIAL PRIMARY KEY,
    idvehicule INTEGER REFERENCES Vehicules(ID_Vehicule),
    idChauffeur INTEGER REFERENCES Conducteurs(ID_Conducteur),
    KilometrageDebut DOUBLE PRECISION,
    KilometrageFin DOUBLE PRECISION,
    DateDepart TIMESTAMP,
    DateArrivee TIMESTAMP,
    CoutTrajet DOUBLE PRECISION,
);

CREATE TABLE Kilometrage (
    ID_Kilometrage SERIAL PRIMARY KEY,
    ID_Trajet INTEGER REFERENCES Trajets(ID_Trajet),
    KilometrageDebut DOUBLE PRECISION,
    KilometrageFin DOUBLE PRECISION,
    Temps INTERVAL,
    -- Autres champs liés au kilométrage
);

CREATE TABLE Itineraires (
    ID_Itineraire SERIAL PRIMARY KEY,
    ID_Trajet INTEGER REFERENCES Trajets(ID_Trajet),
    PointDepart VARCHAR(255),
    PointArrivee VARCHAR(255),
    DureeEstimee INTERVAL,
    DistanceEstimee DOUBLE PRECISION,
    -- Autres champs spécifiques à l'itinéraire
);



CREATE TABLE TypeAssurances(
    idTypeAssurance  SERIAL PRIMARY KEY,
    type varchar(255)

);

CREATE TABLE CompagnieAssurances(
    idCompagnieAssurance SERIAL PRIMARY KEY,
    nom varchar,
    adresse varchar
);

CREATE TABLE Assurances (
    idAssurance SERIAL PRIMARY KEY,
    idVehicule INTEGER REFERENCES Vehicules(ID_Vehicule),
    idTypeAssurance VARCHAR(100),
    idCompagnieAssurance int,
    dateDebutAssurance DATE,
    dateExpirationAssurance DATE,
    montant DOUBLE PRECISION,
);

CREATE TABLE Cargaisons (
    ID_Cargaison SERIAL PRIMARY KEY,
    ID_Trajet INTEGER REFERENCES Trajets(ID_Trajet),
    Description VARCHAR(255),
    Poids DOUBLE PRECISION,
    Volume DOUBLE PRECISION,
    TypeCargaison VARCHAR(100),
);

CREATE TABLE TypeEntretiens(
    idTypeEntretien  SERIAL PRIMARY KEY,
    type varchar(255)

);

CREATE TABLE Entretiens (
    idEntretien SERIAL PRIMARY KEY,
    idVehicule INTEGER REFERENCES Vehicules(ID_Vehicule),
    idTypeEntretien VARCHAR(255),
    dateEntretien DATE,
    cout DOUBLE PRECISION,
    description TEXT,
);
