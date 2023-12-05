package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studenti {


    public String name;
    public String lastName;
    public int course;


    public Studenti(String name, String lastName, int course) {
        this.name = name;
        this.lastName = lastName;
        this.course = course;

    }


    public static void homework() {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("Ievadiet studentu skaitu!");
        List<Studenti> studentsList = new ArrayList<>();
        try {
            count = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Jūs neievadijāt skaitli! Sāciet visu no sākuma!");
            return;
        }


        for (int i = 0; i < count; i++) {


            System.out.println("Ievadi studenta vārdu");
            String name = sc.next();
            System.out.println("Ievadi studenta uzvārdu");
            String lastName = sc.next();
            int course;

            while (true) {
                try {
                    System.out.println("ievadi kursu");
                    course = sc.nextInt();
                    studentsList.add(new Studenti(name, lastName, course));
                    break;
                } catch (Exception e) {
                    System.out.println("Jūs neievadijāt skaitli! Ievadiet skaitli!");
                    sc.nextLine();

                }
            }


        }


        for (int i = 0; i < studentsList.size(); i++) {
            studentsList.get(i).print();
        }
    }


    public void print () {
        System.out.println(name + " " + lastName);
        System.out.println("Kurss: " + course);
        System.out.println("-------------------");
    }
    //
    public static int giveList(int count){

        for(int i = 0; i> count; i++){
            System.out.println();
        }

    }
}











