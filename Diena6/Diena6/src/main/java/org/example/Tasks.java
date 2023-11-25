package org.example;

import java.util.Scanner;

public class Tasks {
    public static void parnest(){
//        skaitli();
        masivs1();

    }

    public static void masivs1(){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];

        for (int i = 0; 1 < a.length; i++) {
            System.out.println("Ievadi");
            a[i] = sc.nextInt();
        }

    }
    private static void skaitli(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        double a = sc.nextDouble();
        double last = Integer.MAX_VALUE;

        while(true){
            a = last;
            System.out.println("Ievadiet skaitli!");
            a = sc.nextDouble();
            if(last < a){
                System.out.println("Hello world!");
            }else{
                break;
            }

        }
    }


}


