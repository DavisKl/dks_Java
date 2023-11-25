package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        md2();
        md1();
    }
public static void md2(){ // Nezinot par Integer.MIN_VALUE
        Scanner sc = new Scanner(System.in);
        int min = -999999;
        System.out.println("Ievadi skaitli");
        int input = sc.nextInt();

        while (input>min){
            min = input;
            System.out.println("Ievadi lielāku skaitli!");
            input = sc.nextInt();
            if(input<min){
                break;
            }

        }
    System.out.println("Lielākais skaitlis: " + min);

}
    public static void md1(){
        String b = "";
        for(int i = 0; i < 5; i++){
            b = b + "$";
            System.out.println(b);

        }
    }
}