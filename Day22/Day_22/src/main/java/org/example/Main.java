package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        employeeOutput();
    }

    public static void employeeOutput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet darbinieka vārdu!");
        String employeeName = sc.next();
        System.out.println("Ievadiet darbinieka uzvārdu!");
        String employeeSurname = sc.next();
        double employeeExpYears = sc.nextDouble();
        Employee emp1 = new Employee(employeeName, employeeSurname, employeeExpYears);
        emp1.print();


    }
}