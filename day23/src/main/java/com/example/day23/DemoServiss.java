package com.example.day23;

import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServiss {

    public List<Employee> getEmployees(){
        Connection conn = Connect.connect();
        List<Employee> lst = Connect.getEmployees(conn);
        return lst;
    }

    public Employee getEmployeesByID(int id){
        Connection conn = Connect.connect();
        List<Employee> lst = Connect.getEmployees(conn);

        for(Employee e : lst){
            if(e.id == id){
                return e;
            }
        }
        return null;
    }

    public Employee getEmpByID(int id){
        Connection conn = Connect.connect();
        Employee e = Connect.getEmployeeByID(conn, id);
        return e;
    }

    public List<Employee> getEmployeeLst(){
        String url = "jdbc:sqlite:C:\\Users\\davis\\Desktop\\Tests\\rcs_Java\\SQL\\Day23MD.db";
        List<Employee> EmployeeLst = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * FROM Employees");

            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("id"),
                        rs.getString("employeeName"),
                        rs.getString("employeeSurname"),
                        rs.getDouble("employeeExpYears"));
                EmployeeLst.add(employee);
            }
            rs.close();
            stmt.close();
            conn.close();

        }catch (Exception e){
            System.out.println("Connection failed");

        }
        return EmployeeLst;
    }

    public Employee getEmployeeByID(int id){
        String url = "jdbc:sqlite:C:\\Users\\davis\\Desktop\\Tests\\rcs_Java\\SQL\\Day23MD.db";
        List<Employee> EmployeeLst = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * FROM Employees WHERE id =" + id);

            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("id"),
                        rs.getString("employeeName"),
                        rs.getString("employeeSurname"),
                        rs.getDouble("employeeExpYears"));
                EmployeeLst.add(employee);
            }


        }catch (Exception e){
            System.out.println("Connection failed");
        }

            for(Employee e : EmployeeLst){
                if(e.id == id){
                    return e;
                }
            }
            return null;
    }

}
