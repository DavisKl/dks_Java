package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("Vardi un 123 un +-");
//        System.out.println(1+2);
//        System.out.println("aaaa " + "bbb");

//        String title = "Mainīgais";
//        title = "Mainīgo sauc String";
//        System.out.println(title + " tada");
//
//        int a = 2; //komentārs
//        a = 3+4;
//        System.out.println(a + 9);
//
//        double v = 3.4;
//        boolean d = true;
//        char e = 'e';

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadied trīs simbolu virknes");
        System.out.print("1. ");
        String ievade1 = sc.nextLine();
        System.out.print("2. ");
        String ievade2 = sc.nextLine();
        System.out.print("3. ");
        String ievade3 = sc.nextLine();
        System.out.println(ievade3 + " " + ievade2 + " " + ievade1);



    }
}