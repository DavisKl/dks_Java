package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        String a = "";

        System.out.println("Skaits");
        int count = sc.nextInt();


        List<String> randomList = new ArrayList<>();
        randomList.add("");




        for(int i = 0; i < count; i++){
            System.out.println("Ievadi vēlamās string vērtības");

            randomList.add(sc.next());
        }
        System.out.println("Izvadīt visus - 0");
        System.out.println("Izvadīt konkrētu - number");

        int choice = sc.nextInt();

        if(choice == 0){
            System.out.println(randomList);
        }else{
            System.out.println(randomList.get(choice));
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

