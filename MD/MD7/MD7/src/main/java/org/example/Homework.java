package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {
    public static int homeWork() {
        Scanner sc = new Scanner(System.in);

        int number = 0;
        boolean done = false;

        while(!done) {
            System.out.println("Ievdi skaitli!");
            done = true;
            try {

                number = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Simbols!");
                number = sc.nextInt();

            }
        }
        return number;


    }
}

