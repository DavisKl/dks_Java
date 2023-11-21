package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task4();
//        sample6();
//        sample5();
//        task3();;
//        sample4();
//        sample3();
//        task2();
//        sample2();
//        sample1();
//        task1();
    }

    public static void task4(){
        Scanner sc = new Scanner(System.in);
        String input = "";
        String random = "";

        System.out.println("Ievadi vārdu!");
        input = sc.nextLine();
        System.out.println("Tu ievadīji vārdu - " + input);

        while(!input.equals("")){
            System.out.println("Ievadiet kādu vārdu!");
            random = sc.nextLine();
            System.out.println(random);
            if(random.equals(input)){
                break;
            }

        }
    }




    public static void sample6(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input = 0;

        while(input>=0){

            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();
            if(input < 0){
                break;
            }

            sum = sum + input;

        }
        System.out.println("Kopējā summa ir " + sum);
    }

    public static void sample5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadīt simbolu virkni");
        String input = "";
        while (!input.equals("exit")){
            System.out.println("Hello world!");
            System.out.println("Ievadīt simbolu virkni!");
            input = sc.nextLine();
        }
    }

    public static void task3(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();
            if( number > 0){
                sum = sum + number;
                System.out.println(number);
                System.out.println("-------------");
            }else{
                System.out.println("Kļūda!");
            }
        }
        System.out.println("Summa ir " + sum);

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


            for(int i = 0; i < 5; i++){
                System.out.println("Lūdzu ievadiet skaitli");
                int number = sc.nextInt();

                if(number == 0) {
                    System.out.println("KĻŪDA!");
                }else if(number == 4){
                    System.out.println("Hello world!");
                }else{
                    System.out.println("Hello world2!");
                }
            }
        }





    public static void sample4(){
        Scanner sc= new Scanner(System.in);

        System.out.println("Lūdzu ievadiet skaitli!");
        int number = sc.nextInt();

        if (number == 5){
            for(int i = 0; i < 5; i++){
                System.out.println("Hello!");
            }
        }else{
            System.out.println("Kļūda");
        }

    }

}