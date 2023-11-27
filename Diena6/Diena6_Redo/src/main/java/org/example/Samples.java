package org.example;

import java.util.Scanner;

public class Samples {

    public static void arrayWithParam(int[] par){

        for(int i = 0; i < par.length; i++){
            System.out.println(par[i]);
        }

    }

    public static void sample3(){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];

        for(int i = 0; i < a.length; i++){
            System.out.println("Ievadiet vērtību!");
            a[i] = sc.nextInt();

        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void sample2(){
        int[] a = {3, 5, 7, 77, 9, 1};


        for(int i = 0; i < 6; i++){
            System.out.println(a[i]);
        }

        a[4] = 33;

        for(int i = 0; i < 6; i++){
            System.out.println(a[i]);
        }
    }

    public static void sample1(){
        int[] a = new int[6];
        a[0] = 3;
        a[1] = 5;
        a[2] = 7;
        a[3] = 77;
        a[4] = 9;
        a[5] = 1;

        for(int i = 0; i < 6; i++){
            System.out.println(a[i]);
        }

    }
}
