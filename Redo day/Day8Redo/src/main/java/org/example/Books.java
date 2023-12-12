package org.example;

public class Books {

    public String author;
    public String title;
    public int publishingDate;

    public Books (String author, String title, int publishingDate){
        this.author = author;
        this.title = title;
        this.publishingDate = publishingDate;

    }

    public void print(){
        System.out.println("Grāmatas " + title + " autors ir " + author);
        System.out.println("Grāmata izdota: " + publishingDate);
        System.out.println("--------------------------------");
    }
}
