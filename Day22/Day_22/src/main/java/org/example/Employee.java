package org.example;

public class Employee {
    public String employeeName;
    public String employeeSurname;
    public double employeeExpYears;

    public Employee(String employeeName, String employeeSurname, double employeeExpYears){
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeeExpYears = employeeExpYears;
    }

    public void print(){
        System.out.println("Darbinieks: " + employeeName + " " + employeeSurname);
        System.out.println("Darbinieka darba pieredze: " + employeeExpYears);
        System.out.println("----------------------------------------");
    }

}
