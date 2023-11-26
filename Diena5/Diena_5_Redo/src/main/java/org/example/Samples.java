package org.example;

import java.util.Scanner;

public class Samples {

    public static int c = 3;

    public static void sample1(){
        int a = sum();
        c = 55;
        System.out.println(a);
    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadi skaitli");
        int sk2 = sc.nextInt();

        return sk1 + sk2;
    }





}
