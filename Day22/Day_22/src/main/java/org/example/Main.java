package org.example;

import com.google.gson.Gson;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        employeeOutput();
        Connection conn = Employee.connect();
        Employee.readEmployee(conn);

    }
    public static void employeeOutput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet darbinieka vārdu!");
        String employeeName = sc.next();
        System.out.println("Ievadiet darbinieka uzvārdu!");
        String employeeSurname = sc.next();
        System.out.println("Ievadiet darbinieka darba stāžu!");
        double employeeExpYears = sc.nextDouble();
        Employee emp1 = new Employee(employeeName, employeeSurname, employeeExpYears);
        emp1.print();
        Gson g = new Gson();
        String json = g.toJson(emp1);
        System.out.println(json);

        Employee e2 = g.fromJson(json, Employee.class);
        System.out.println(e2.employeeName);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(e2);
        employeeList.add(new Employee("haris", "Zumba", 4));

        String json2 = g.toJson(employeeList);
        System.out.println(json2);

        List<Employee> lst2 = Arrays.asList(g.fromJson(json2,Employee[].class));
        System.out.println(lst2.get(2).employeeName);
    }
}