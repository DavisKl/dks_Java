package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Samples.sample1();

        System.out.println("Lielākais skaitlis ir : " + Tasks.biggestNumber(6));


        int c = Samples.sum();




        int bigger = Tasks.task2(5, 4);
        System.out.println(bigger);


        System.out.println(Tasks.combineStrings("ddd"));


        int a = Samples.sum();
        int b = Samples.sum();

        System.out.println(a + b);

        Tasks.task1("aa", 3);

    }











}