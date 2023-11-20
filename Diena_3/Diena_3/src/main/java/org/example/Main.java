package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample3();
//        task2();
//        sample2();
//        sample1();
//        task1();
    }


    public static void sample1(){

        for(int i = 0; i < 5; i++){
            System.out.println(i);
            System.out.println("Hello world!");
            System.out.println("-----------------");
        }

    }
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        int a = 5;
        for(int i = 1; i < 8; i++){
            System.out.println(i + ". uzdevums!");
            System.out.println("Ievadi skaitli!");
            int b = sc.nextInt();
            System.out.println(b + a);
        }
    }

    public static void sample2() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Lūdzu ievadi skaitli!");
            int number = sc.nextInt();
            sum = sum + number;
            System.out.println(number);
            System.out.println("-----------------");
        }
        System.out.println("Summa ir " + sum);
    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        int len = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Lūdzu ievadi simbolu virkni!");
            String a = sc.nextLine();
            len = len + a.length();
            System.out.println(a);
            System.out.println("-----------------");
        }
        System.out.println("Garums ir " + len);
    }

    public static void sample3(){
        Scanner sc = new Scanner(System.in);
        
    }
}