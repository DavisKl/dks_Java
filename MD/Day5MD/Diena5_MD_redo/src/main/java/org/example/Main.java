package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice = "";

        System.out.println("Sveiki!");
        System.out.println("Izvēlieties programmas beigu frāzi!");
        String end = sc.nextLine();
        System.out.println(end);

        while (!choice.equals(end)) {
            System.out.println("Izvēlieties vēlamo matemātikso darbību!");
            System.out.println("Saskaitīt: (+)");
            System.out.println("Atņemt: (-)");
            System.out.println("Reizināt: (*)");
            System.out.println("Dalīt: (/)");
            choice = sc.nextLine();

            if (choice.equals("+")) {
                double sum = Calculations.add();
            } else if (choice.equals("-")) {

                Calculations.div();

            } else if (choice.equals("*")) {

                Calculations.multi();

            } else if (choice.equals("/")) {

                Calculations.div();

            }

        }

    }
}
