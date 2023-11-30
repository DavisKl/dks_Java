package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book input = new Book();

        for(int i = 0; i < 2; i++){
            System.out.println("Ievadi grāmatas autoru!");
            input.author = sc.next();
            System.out.println("Ievadi grāmatas nosaukumu!");
            input.title = sc.next();
            System.out.println("Ievadi grāmatas izdošanas gadu");
            input.year = sc.nextInt();
            input.printBook();
        }










//        Students st = new Students();
//        st.name = "Jānis";
//        st.lastName = "Bērziņš";
//        st.course = 1;
//
//        st.print();
//
//        Students st2 = new Students();
//        st2.name = "Juris";
//        st2.lastName = "Gogo";
//        st2.course = 3;
//
//        st2.print();

    }


}