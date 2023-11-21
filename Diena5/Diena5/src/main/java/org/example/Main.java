package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = sum();
//        task1("aa", 3);


    }

    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int sk2 = sc.nextInt();

        return sk1 + sk2;
    }
    public static void task1(String symbols, int count){

        String sum = "";
        for(int i = 0; i < count; i++){
            sum = sum + " " + symbols;
            System.out.println(sum);
        }

    }
}