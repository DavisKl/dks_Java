package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        tests(-1);

        int result2 = task3(5);
        System.out.println(result2);

        String f = sampleFull("aaaaaa", "dddddddd", "Āfafafafa");
        System.out.println(f);

        String something = anotherSample();
        System.out.println(something);

        int result = sampleWithReturn();
        System.out.println(result);

        task2b(-10);

        task2(10);

        task1("aaaaaa", "bbbbb", "ccccc");

        sampleWithParams(3, 3);
        sampleWithParams(99, -15);

        anotherSampleWithSample("Parametrs");

        String c = "aeaadadafasfafdfd";
        anotherSampleWithSample(c);

        c = "wqdqdq";
        anotherSampleWithSample(c);

    }

    public static void tests(int count){
        int result = 0;

        if(count > 0) {
            for (int i = 1; i < count + 1; i++) {
                result = result + i;
            }
        }else if (count <= 0){
            result = 0;
        }
        System.out.println(result);

    }
    public static int task3(int count){
       int result = 0;
       if(count > 0) {
           for(int i = 1; i < count + 1; i++){
               result = result + i;
           }
       }else if (count <= 0){
           result = 0;
       }
       return result;


    }



    public static String sampleFull(String a, String b, String c){

        String result = c + b + a;
        if(result.length() > 15){
            return c + b;
        }else {
            return result;
        }

    }

    public static String anotherSample(){
        String c = "atgriešanās";
        return c;
    }
    public static int sampleWithReturn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli!");
        int a = sc.nextInt();

        System.out.println("ievadi otru skaitli!");
        int b = sc.nextInt();

        int c = a + b;

        return c;
    }
    public static void task2b(int count){
        String a = "";

        for(int i = 0; i < count; i++){
            a = a + "$";
            if(count < 1){
                a = "$";
            }
            System.out.println(a);
        }

    }

    public static void task2(int count){
        String a = "";

        if(count >= 1){
            for(int i = 0; i < count; i++){
                a = a + "$";
                System.out.println(a);
            }

            }else {
            System.out.println("$");
        }
    }


    public static void task1(String a, String b, String c){

        if(a.length() + b.length() + c.length() > 15){
            System.out.println(a + c);
        }else{
            System.out.println(c + a + b);
        }

    }
    public static void anotherSampleWithSample(String a){
        System.out.println(a);

    }
    public static void sampleWithParams(int a, int b){
        System.out.println("Summa ir: ");
        System.out.println(a+b);
    }


}