package org.example;

import java.util.Scanner;

public class Samples {

    public static void sample3() {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];

        for (int i = 0; 1 < a.length; i++) {
            System.out.println("Ievadi");
            a[i] = sc.nextInt();
        }
    }




    public static void sample2(){
        int[] a = {3, 5, 55, 6789, 32};

        for(int i = 0; i < 6; i++){
            System.out.println(a[i]);
    }

    public static void sample1() {
        int[] a = new int[6];
        a[0] = 3;
        a[1] = 5;
        a[2] = 6;
        a[3] = 76;
        a[4] = 9;
        a[5] = 44;

        for(int i = 0; i < 6; i++){
            System.out.println(a[i]);
        }
    }

}
