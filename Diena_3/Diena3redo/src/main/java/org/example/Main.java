package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task4();
        sample6();
        sample5();
        task3();
        sample4();
        sample3();
        task2();
        sample2();
        task1();
        sample1();
    }

    public static void task4(){
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("Uzminamais vārds!");
        String eureka = sc.nextLine();

        while(!input.equals(eureka)){
            System.out.println("Uzmini manu vārdu!");
            input = sc.nextLine();
        }
        System.out.println("Apsveicu tu uzminēji manu vārdu: " + input + " !");


    }

    public static void sample6(){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int sum = 0;

        while(input >= 0){

            System.out.println("Ievadiet pozitīvu skaitli");
            input = sc.nextInt();


            if(input < 0){
                break;
            }
            sum = sum + input;

        }
        System.out.println("Skaitļu summa ir: " + sum);

    }

    public static void sample5(){
        Scanner sc = new Scanner(System.in);

        String input = "";
        //cikls darbojas, kamēr neuzraksta exit
        // ! ir pagriezt uz otru pusi
        while(!input.equals("exit")){
            System.out.println("Ievadiet simbolus!");
            input = sc.nextLine();

        }
    }
    public static void task3(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Ievadiet pozitīvu skaitli!");
            int number = sc.nextInt();
            if(number > 0){
                sum = sum + number;
            }else{
                System.out.println("Kļūda");
            }
        }
        System.out.println("Skaitļu summa ir : " + sum);
    }

    public static void sample4(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu skaitli!");
        int number = sc.nextInt();

        if(number == 5){
            for(int i = 0; i < 5; i++){
                System.out.println("Hello");
            }
        }else{
            System.out.println("Ir kļūda");
        }
    }
    public static void sample3(){
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < 5; i++) {
            System.out.println("Lūdzu skaitli atkal!");
            int number = sc.nextInt();

            if (number == 0){
                System.out.println("Kļūda!");
            }else if (number == 4){
                System.out.println("Hello1");
            }else{
                System.out.println("Hello2");
            }
        }
    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("----------");
            System.out.println("Ievadi simbolu virkni!");
            String a = sc.nextLine();
            sum = sum + a.length();
        }
        System.out.println("Vērtību kopējais garums ir " + sum);
    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i<7; i++){
            System.out.println("-----------");
            System.out.println("Ievadi skaitli!");
            int number = sc.nextInt();
            sum = sum + number;
            System.out.println(number);
        }
        System.out.println("Summa ir " + sum);

    }
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++){

            System.out.println("Ievadi skaitli!");
            int number = sc.nextInt();
            System.out.println("ievadītais skaitlis ir " + (number + 5));
            System.out.println("-------------");
        }
    }


    public static void sample1(){

        for(int i = 0; i < 5; i++) { //sākam skaitli ar 0, sākam skaitīt kamēr i ir mazāks par 5, i=i+1
            System.out.println(i + 1);
            System.out.println("hello");
            System.out.println("------------");
        }

    }
}