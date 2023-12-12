package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task2();

        Books a = task1();
        a.print();
        Books b = task1();
        b.print();

        sample1();










    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        List<Books> booksList = new ArrayList<>();
        System.out.println("Ievadi sarakstu daudzumu!");
        int listSize = sc.nextInt();

        for(int i = 0; i < listSize; i++){

            System.out.println("Ievadi grāmatas autoru");
            String author = sc.next();
            System.out.println("Ievadi grāmatas nosaukumu!");
            String title = sc.next();
            System.out.println("Ievadi grāmatas izdošanas gadu!");
            int publishingYear = sc.nextInt();
            booksList.add(new Books(author, title, publishingYear));

            for(var s : booksList){
                booksList.get(i).print();
            }
        }

    }

    public static Books task1(){
        Scanner sc = new Scanner(System.in);
        Books input = new Books("asd", "dasda", 3);

        System.out.println("Ievadi grāmatas autoru!");
        input.author = sc.next();
        System.out.println("Ievadi grāmatas nosaukumu!");
        input.title = sc.next();
        System.out.println("Ievadi grāmatas izdošanas gadu!");
        input.publishingDate = sc.nextInt();


        return input;
    }
    public static void sample1() {

        Studenti st = new Studenti("Jānis", "Bērziņš", 1);
        st.print();

        Studenti st2 = new Studenti("Juris", "Kuģis", 5);
        st2.print();

        List<Studenti> studentList= new ArrayList<>();
        studentList.add(st);
        studentList.add(st2);

        studentList.add(new Studenti("Anna", "Lapsa", 2));
        studentList.get(0).lastName = "dad";

        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i).lastName);
            studentList.get(i).print();
        }

//        for(var s: studentList){
//            s.print();
//        }

    }

}