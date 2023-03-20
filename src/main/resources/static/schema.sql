CREATE TABLE Etudiant (
    NumINU INT NOT NULL PRIMARY KEY,
    Nom VARCHAR(25) NOT NULL,
    Prenom VARCHAR(25) NOT NULL,
    DateNaiss DATE,
    Adresse VARCHAR(50)
);

CREATE TABLE Promotion (
    IdPromo VARCHAR(4) NOT NULL PRIMARY KEY,
    AnneeUniv VARCHAR(7)
);

CREATE TABLE Academique (
    NumINU INT FOREIGN KEY,
    IdPromo VARCHAR(4) FOREIGN KEY,
    Semestre VARCHAR(25),
    Etablissement VARCHAR(25),
    Ville VARCHAR(25),
    Pays VARCHAR(25),
    Toeic BIT
);

CREATE TABLE Alternance (
    NumINU INT FOREIGN KEY,
    IdPromo VARCHAR(4) FOREIGN KEY,
    Entreprise VARCHAR(25),
    DureeContrat INT,
    Ville VARCHAR(25),
    Pays VARCHAR(25),
    Toeic BIT
);

CREATE TABLE Stage (
    NumINU INT FOREIGN KEY,
    IdPromo VARCHAR(4) FOREIGN KEY,
    Entreprise VARCHAR(25),
    Duree INT,
    Ville VARCHAR(25),
    Pays VARCHAR(25),
    Langue VARCHAR(25)
);

CREATE TABLE IngenieurHumaniste (
    NumINU INT FOREIGN KEY,
    IdAction INT PRIMARY KEY,
    Intitule VARCHAR(50),
    Description VARCHAR(250)
);
