CREATE TABLE Owners(
    id INTEGER PRIMARY KEY,
    name TEXT(30)
);

CREATE TABLE Pets(
    id INTEGER PRIMARY KEY,
    name TEXT(30) NOT NULL,
    type TEXT(20),
    ownerId INTEGER,
    FOREIGN KEY(ownerId) REFERENCES Owners(id)
);

DROP TABLE Pets;

INSERT INTO Owners(id, name)
VALUES 
(1, "Jānis"),
(2, "Anna");

SELECT * FROM Owners;

INSERT INTO Pets(id, name, type)
VALUES(1, 'Muris', 'Kaķis');

INSERT INTO Pets(id, name, type, ownerId)
VALUES(2, 'Rada', 'Suns', 1);

INSERT INTO Pets(id, name, type, ownerId)
VALUES(3, 'Poga', 'Suns', 1),
      (4, 'Miks', 'Kaķis', 2);
      
SELECT * FROM Pets;

SELECT name, type 
FROM Pets
WHERE type = "Kaķis";


SELECT Pets.name, Pets.type, Owners.name 
FROM Pets, Owners
WHERE Pets.ownerId = Owners.id;