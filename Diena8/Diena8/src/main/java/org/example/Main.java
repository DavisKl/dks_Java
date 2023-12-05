package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task2();
//        sample1();
//
//        Book b1 = inputBook();
//        Book b2 = inputBook();
//
//        task1();





    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet studentu skaitu!");
        int count = sc.nextInt();
        List<Students> studentsList = new ArrayList<>();



        for (int i = 0; i < count; i++){

            System.out.println("Ievadi studenta vārdu");
            String name = sc.next();
            System.out.println("Ievadi studenta uzvārdu");
            String lastName = sc.next();
            System.out.println("ievadi kursu");
            int course = sc.nextInt();
            studentsList.add(new Students(name, lastName, course));

        }

        for(int i = 0; i<studentsList.size(); i++){
            studentsList.get(i).print();
        }


    }


    public static void task1(){
        Scanner sc = new Scanner(System.in);

        Book input = new Book();
        System.out.println("Ievadi grāmatas autoru!");
        input.author = sc.next();
        System.out.println("Ievadi grāmatas nosaukumu!");
        input.title = sc.next();
        System.out.println("Ievadi grāmatas izdošanas gadu");
        input.year = sc.nextInt();
        input.printBook();


        Book input2 = new Book();
        System.out.println("Ievadi grāmatas autoru!");
        input.author = sc.next();
        System.out.println("Ievadi grāmatas nosaukumu!");
        input.title = sc.next();
        System.out.println("Ievadi grāmatas izdošanas gadu");
        input.year = sc.nextInt();
        input.printBook();
    }

    public static void sample1(){
        Students st = new Students("Jānis", "Bērziņš", 1);


        st.print();

        Students st2 = new Students("Juris", "Gogo", 3);

        st2.print();

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(st);
        studentsList.add(st2);

        studentsList.add(new Students("Anna", "Vītola", 3));



        for(int i = 0; i < studentsList.size(); i++){
            System.out.println(studentsList.get(i).lastName);
            studentsList.get(i).print();
        }

        for(var s : studentsList){
            s.print();
        }

    }


public static Book inputBook(){
    Scanner sc = new Scanner(System.in);

    Book input = new Book();
    System.out.println("Ievadi grāmatas autoru!");
    input.author = sc.next();
    System.out.println("Ievadi grāmatas nosaukumu!");
    input.title = sc.next();
    System.out.println("Ievadi grāmatas izdošanas gadu");
    input.year = sc.nextInt();
    input.printBook();
    return input;
}

}