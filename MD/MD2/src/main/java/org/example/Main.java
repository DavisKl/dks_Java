package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        md2();
        md1();
    }

    public static void md2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();
        System.out.println(a);

        int last = Integer.MIN_VALUE;

        while (a > last){
            System.out.println("Ievadi nāķošo skaitli!");
            int input = sc.nextInt();
            System.out.println(input);
            if(a > input){
                System.out.println("Skaitlis mazāks kā iepriekšējais!");
                break;
            }


        }


    }
    public static void md1(){
        Scanner sc = new Scanner(System.in);
        String a = "";
        System.out.println("Ievadi skaitli!");
        int b = sc.nextInt();

        for(int i = 0; i < b; i++){
            a = a + "$";
            System.out.println(a);





        }


    }
}