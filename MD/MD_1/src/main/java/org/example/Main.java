package org.example;

import java.util.Scanner;

public class Main(String[] args)  {
    public static void main{
        md1();
    }
public static void md1(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ievadi simbolu virkni!");
    String a = sc.nextLine();
    if (a > 10) {
        System.out.println("###");
    } else if (a < 10) {
        System.out.println("##");
    } else if (a == 10) {
        System.out.println("#");
    }
}
}
