package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

    public static Connection connect(){
        String url = "jdbc:sqlite:C:\\Users\\davis\\Desktop\\Tests\\rcs_Java\\SQL\\Day22_1.db";
        Connection conn = null;

        try{conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        }catch (Exception e){
            System.out.println("Connection failed");
        }
        return conn;
    }

    public static void readEmployee(Connection conn){
        String sql = "SELECT * FROM Employee";

        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()){
                System.out.println("Darbinieks: " + rs.getString("name") + " " + rs.getString("surname"));
                System.out.println("Darba pieredze: " + rs.getInt("exp"));
                System.out.println("--------------------------------------------------------");
                System.out.println();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
