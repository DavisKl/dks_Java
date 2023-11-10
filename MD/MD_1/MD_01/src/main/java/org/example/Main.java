package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        md1();
        md2();
    }
    public static void md1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi simbolu virkni");
        String a = sc.nextLine();
        int len = a.length();
        if(a.length()> 10) {
            System.out.println("###");
        } else if (a.length()< 10) {
            System.out.println("##");
        } else if (a.length()== 10) {
            System.out.println("#");

        }
    }
    public static void md2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi simbolu virkni");
        String b = sc.nextLine();
        int len = b.length();
        if(len <= 10 && len >= 5) {
            System.out.println(" Ir OK");
        } else if (len > 10 || len < 5) {
            System.out.println("Not OK");
        }
    }
}




