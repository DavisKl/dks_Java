package org.example;

import java.util.Scanner;

public class Tasks {

    public static void task3(){
        Scanner sc = new Scanner(System.in);

        String [] a = new String[5];

        for(int i = 0; i < a.length; i++){
            System.out.println("Ievadi simbolus!");
            a[i] = sc.nextLine();
        }

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + ", " + a[i].length());
        }
    }

    public static void run(){
        task2();
    }

    private static void task2(){
        Scanner sc = new Scanner(System.in);

        double max = Integer.MAX_VALUE;
        System.out.println("Ievadiet skaitli!");
        double input = sc.nextDouble();


        while(true){
            max = input;
            System.out.println("Ievadiet mazāku skaitl par iepriekšējo");
            input = sc.nextDouble();


            if(input < max){
                System.out.println("Hello world!");
            }else{
                System.out.println("Nepareizi");
                break;
            }
        }





    }




    public static double task1(int count){
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        for(int i = 0; i < count ; i++){
            System.out.println("Ievadi skaitli!");
            double input = sc.nextDouble();
            sum+=input;

        }


        return sum/count;

    }




}
