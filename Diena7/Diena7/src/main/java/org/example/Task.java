package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        String a = "";

        System.out.println("Cik vērtības vēlieties pievienot listam?");
        int count = sc.nextInt();
        List<String> randomList = new ArrayList<>(count);


        for(int i = 0; i < randomList.size(); i++){
            System.out.println("Ievadi vēlamās string vērtības");
            a = sc.nextLine();
            randomList.add(a);
        }

    }

    public static double task1_1(double [] arr){
        double largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static double task1(double [] arr){
        double answ = 0;


        for(int i = 0; i < arr.length; i++){
            if(arr[i] > answ){
                answ-=answ;
                answ+= arr[i];
            }
        }
        return answ;
    }





}

