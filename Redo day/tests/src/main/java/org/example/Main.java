package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        sample1();
    }

    public static void sample1(){
        int[] arr = {1,2,1,2};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }
        }
    }
}