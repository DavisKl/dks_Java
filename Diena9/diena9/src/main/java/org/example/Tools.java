package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {








    public static List<Pet>petIDList(int a){
        Scanner sc = new Scanner(System.in);
        List<Pet> petIDList = new ArrayList<>();




        for (int i = 0; i < a; i++){

            System.out.println("Ievadi dzīvnieka vārdu!");
            String petName = sc.next();
            System.out.println("Ievadi dzīvnieka sugu!");
            String type = sc.next();
            System.out.println("ievadi dzīvnieka vecumu!");
            int age = sc.nextInt();
            System.out.println("Ievadi īpašnieka e-pastu!");
            String email = sc.next();
            petIDList.add(new Pet(petName, type, age, email));


        }
        return petIDList;
    }

public static void addPet(List<Pet>lst){
        
}


}

