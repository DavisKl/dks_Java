package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {



    public static void run(){

        task2();
    }

    public static int task3(){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Ievadiet skaitli!");
        try{
            a = sc.nextInt();
        }catch (Exception e){
            System.out.println("Nav ievadīts skaitlis, automātisks 0");
            a = 0;
        }
        return a;
    }


    private static void task2(){
        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        System.out.println("Cik vērtības vēlieties listam?");
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            System.out.println("Ievadiet simbolus!");
            stringList.add(sc.next());
        }
        System.out.println("Ko vēlieties izvadīt?");
        System.out.println("Ja vēlaties izvadīt visu sarakstu ar simboliem: 1");
        System.out.println("Ja vēlaties konkrētu vērtību: 2");
        String choice = sc.next();

        if(choice.equals("1")){
            for(String el : stringList){
                System.out.println(el);
            }
        }else if(choice.equals("2")){
            try {
                System.out.println("Kuru vērtību vēlieties izvadīt");
                int element = sc.nextInt();
                System.out.println(stringList.get(element - 1));
            }catch (Exception e){
                System.out.println("Nepareiza ievade!");
            }
        }else{
            System.out.println("nepareiza ievade!");
        }
    }

    public static double task1(double[] arr){
        double largest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;

    }

}