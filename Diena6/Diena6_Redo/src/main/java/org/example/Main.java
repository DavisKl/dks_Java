package org.example;

public class Main {
    public static void main(String[] args) {

        Tasks.task3();

        int[] a = {3, 5, 7, 77, 9, 1};
        int[] b = {53, 1111, 333, 343, 5, 666};

        Samples.arrayWithParam(a);
        Samples.arrayWithParam(b);
        Tasks.run();

        task1();




    }

    public static void task1(){
        System.out.println(Tasks.task1(4));


    }


}