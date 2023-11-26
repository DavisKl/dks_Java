package org.example;

import java.util.Scanner;

public class Tasks {

    public static int biggestNumber(int count){
        Scanner sc = new Scanner(System.in);
        int bigger = Integer.MIN_VALUE;
        int input = 0;
        for(int i = 0; i < count; i++){
            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();
            if(input > bigger){
                bigger = input;
            }
        }
        return bigger;
    }

    public static int task2(int a, int b){
        int result = 0;

        if(a>=b){
            result = a;
        }else {
            result = b;
        }
        return result;
    }

    public static String combineStrings(String param){
        String nil = "";
        for(int i = 0; i < 10; i++){
            nil = nil + param;
        }
        return nil;
    }

    public static void task1(String a, int b){
        String result = "";


        for(int i = 0; i < b; i++){
            result = result + a + " ";
            System.out.println(result);
        }
    }




}
