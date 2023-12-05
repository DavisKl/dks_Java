package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pet>lst = Tools.petIDList(1);
        Tools.addPet(lst);

        print(lst);






    }

    public static void print(List<Pet>lst){
        for(var pet: lst){
            pet.print();
        }

        }


    }

