package org.example;

public class Book {
    public String author;
    public String title;
    public int year;

    public void printBook(){
        System.out.println("Grāmatas autors: " + author);
        System.out.println("Grāmatas nosaukums: " + title);
        System.out.println("Izdošanas gads: " + year);
    }

}
