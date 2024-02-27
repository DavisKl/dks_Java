package com.example.day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Connect {

    public static Connection connect(){
        String url = "jdbc:sqlite:C:\\Users\\davis\\Desktop\\Tests\\rcs_Java\\SQL\\Day23MD.db";
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        }catch (Exception e){
            System.out.println("Connection failed");
        }
        return conn;
    }

    public static List<Employee> getEmployees(Connection conn){
        String sql = "SELECT * FROM employees";
        List<Employee> emp = new ArrayList<>();

        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()){
                emp.add(new Employee(
                        rs.getInt("id"),
                        rs.getString("employeeName"),
                        rs.getString("employeeSurname"),
                        rs.getInt("employeeExpYears")));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    return emp;
    }
}
