package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Studenti.homework();


        List<Studenti> saraksts = new ArrayList<>();
        saraksts.add(new Studenti("Andris", "dasdas", 3));
        saraksts.add(new Studenti("asda", "ddads", 3));
        printStudentList(saraksts);
    }



    private static void printStudentList(List<Studenti>saraksts){
        for (var st : saraksts){
            st.print();
        }
    }

    private static List<Studenti> getStudentLst(int a){
        if(a<1){
            System.out.println("Kļūda!");
            a = 1;
        }
        List<Studenti>saraksts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a; i++){
            System.out.println("Ievadi studenta vārdu");
            String name = sc.next();
            System.out.println("Ievadi studenta uzvārdu");
            String lastName = sc.next();
            int course;

            while (true) {
                try {
                    System.out.println("ievadi kursu");
                    course = sc.nextInt();
                    saraksts.add(new Studenti(name, lastName, course));
                    break;
                } catch (Exception e) {
                    System.out.println("Jūs neievadijāt skaitli! Ievadiet skaitli!");
                    sc.nextLine();

                }
            }
        }

        return saraksts;
    }


}