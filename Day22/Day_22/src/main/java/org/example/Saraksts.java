package org.example;

import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Saraksts {
    public static List<Employee> darbinieki(){
        String url = "jdbc:sqlite:C:\\Users\\davis\\Desktop\\Tests\\rcs_Java\\SQL\\Day22_1.db";
        List<Employee> saraksts = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select name, surname, exp FROM employee");

            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getInt("exp"));
                saraksts.add(employee);
            }
        }catch (Exception e){
            System.out.println("Connection failed");
        }
        return saraksts;
    }

    public static void converter(){
        List<Employee> saraksts = darbinieki();
        Gson gson = new Gson();
        String json = gson.toJson(saraksts);
        System.out.println(json);
    }
}
