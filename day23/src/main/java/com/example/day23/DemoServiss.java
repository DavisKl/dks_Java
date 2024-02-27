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
        List<Employee> lst = new ArrayList<>();
        lst.add(new Employee(1, "Jānis", "Bērziņš", 1));
        lst.add(new Employee(2, "Anna", "Daugava", 3));
        lst.add(new Employee(3, "Andrios", "Pibana", 6));
        return lst;
    }

    public Employee getEmployee(int id){
        List<Employee> lst = new ArrayList<>();

        lst.add(new Employee(1, "Jānis", "Bērziņš", 1));
        lst.add(new Employee(2, "Anna", "Daugava", 3));
        lst.add(new Employee(3, "Aldis", "Valdis", 7));

        for(Employee e : lst){
            if(e.id == id){
                return e;
            }
        }
        return null;
    }

    public List<Employee> getEmployeeLst(){
        String url = "jdbc:sqlite:C:\\Users\\davis\\Desktop\\Tests\\rcs_Java\\SQL\\Day23MD.db";
        List<Employee> EmployeeLst = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select id, employeeName, employeeSurname, employeeExpYears FROM Employees");

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
        List<Employee> employeeList = getEmployeeLst();

            for(Employee e : employeeList){
                if(e.id == id){
                    return e;
                }
            }
            return null;
    }

}
