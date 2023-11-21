package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(tasks.biggestNumber(4));

        int number = big(2,4);
        System.out.println(number);

//        Samples.sample1();
//        int a = Samples.sum();
//        System.out.println(a);






//        int a = sum();
//        task1("aa", 3);


    }
    public static int big(int a, int b){


        if(a >= b){
            return a;
        }
        return b;


    }
    public static String combineStrings(String param){
        String result = "";
        for(int i = 0; i < 10; i++){
            result = result + param;
        }
        return result;

    }


}