package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer(3, 4);




//        int a = sum();
//        task1("aa", 3);


    }
    public static void Integer (int a, int b){
        int result;


        if( a >= b){
            result = a;
        } else if (a < b) {
            result = b;
        }
        return result;


    }
    public static String combineStrings(String param){
        String result = "";
        for(int i = 0; i < 10; i++){
            result = result + param;
        }
        return result;

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