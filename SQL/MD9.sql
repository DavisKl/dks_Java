CREATE TABLE Author(
    id INTEGER PRIMARY KEY,
    authorName TEXT (30),
    authorSurname TEXT (30),
    authorBirthYear INTEGER (30)
);

CREATE TABLE Books(
    id INTEGER PRIMARY KEY,
    bookTitle TEXT (30),
    releaseYear INTEGER (30),
    authorId INTEGER,
    FOREIGN KEY (authorId) REFERENCES Author(id)
);
INSERT INTO Author(id, authorName, authorSurname, authorBirthYear)
VALUES
(1, 'Andris', 'Arājs', 1990),
(2, 'Zane', 'Zuzane', 1980),
(3, 'Jānis', 'Bietes', 1967);
SELECT * FROM Author;
INSERT INTO Books(id, bookTitle, releaseYear, authorId)
VALUES
(1, 'Dūnas', 2000, 1),
(2, 'Ielas', 2012, 3),
(3, 'Koki', 2003, 2),
(4, 'Zvēri', 2020, 2),
(5, 'Kalkūna', 1999, 1);
SELECT * FROM Books;

SELECT Author.authorName, Author.authorSurname, Author.authorBirthYear, Books.bookTitle, Books.releaseYear
FROM Author, Books
WHERE Books.authorId = Author.id;
