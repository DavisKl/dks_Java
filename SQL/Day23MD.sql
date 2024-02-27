CREATE TABLE Employees(
    id INTEGER PRIMARY KEY,
    employeeName TEXT(30) NOT NULL,
    employeeSurname TEXT (30) NOT NULL,
    employeeExpYears INTEGER (30) NOT NULL
);

INSERT INTO Employees(id, employeeName, employeeSurname, employeeExpYears)
VALUES(1, 'Jānis', 'Bērziņš', 3),
    (2, 'Anna', 'Zuzanna', 7),
    (3, 'Olga', 'Molga', 6),
    (4, 'Agris', 'Smacus', 1);
    
SELECT * FROM Employees