package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {
    public static int homeWork() {
        Scanner sc = new Scanner(System.in);

        int number = 0;
        int max = Integer.MAX_VALUE;

        while(number < max) {
            try {
                System.out.println("Ievadi skaitli!");
                number = sc.nextInt();
                return number;
            } catch (Exception e) {
                System.out.println("Simbols!");
                number = sc.nextInt();

            }
        }
        return number;


    }
}

