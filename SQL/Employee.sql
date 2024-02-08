--
-- File generated with SQLiteStudio v3.4.4 on Thu Feb 8 20:58:59 2024
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Employee
CREATE TABLE IF NOT EXISTS Employee(
id INTEGER PRIMARY KEY,
name TEXT(30),
surname TEXT(30),
exp INTEGER (30)
);
INSERT INTO Employee (id, name, surname, exp) VALUES (1, 'Andris', 'Arajs', 3);
INSERT INTO Employee (id, name, surname, exp) VALUES (2, 'Juris', 'Jukaiss', 7);
INSERT INTO Employee (id, name, surname, exp) VALUES (3, 'Zane', 'Zuzane', 5);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
