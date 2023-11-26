package org.example;

import java.util.Scanner;

public class Calculations {

    public static double div(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli!");
        double a = sc.nextDouble();
        System.out.println("Ievadi otru skaitli!");
        double b = sc.nextDouble();

        double sum = a / b;
        System.out.println("Rezultāts ir: " + sum);
        System.out.println("                      ");
        System.out.println("______________________");

        return sum;

    }


    public static double multi(){
        Scanner sc = new Scanner(System.in);


        System.out.println("Ievadi pirmo skaitli!");
        double a = sc.nextDouble();
        System.out.println("Ievadi otru skaitli!");
        double b = sc.nextDouble();

        double sum = a * b;
        System.out.println("Rezultāts ir: " + sum);
        System.out.println("                      ");
        System.out.println("______________________");

        return sum;

    }

    public static double sub(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli!");
        double a = sc.nextDouble();
        System.out.println("Ievadi otru skaitli!");
        double b = sc.nextDouble();

        double sum = a - b;
        System.out.println("Rezultāts ir: " + sum);
        System.out.println("                      ");
        System.out.println("______________________");

        return sum;

    }



    public static double add(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli!");
        double a = sc.nextDouble();
        System.out.println("Ievadi otru skaitli!");
        double b = sc.nextDouble();


        double sum = a + b;
        System.out.println("Rezultāts ir: " + sum);
        System.out.println("                      ");
        System.out.println("______________________");
        return sum;

    }


}
