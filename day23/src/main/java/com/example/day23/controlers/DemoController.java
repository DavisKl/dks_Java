package com.example.day23.controlers;

import com.example.day23.DemoServiss;
import com.example.day23.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DemoController {
    @Autowired
    private DemoServiss demoServiss;

    @RequestMapping(value="/employees", method= RequestMethod.GET)
    List<Employee> getEmployee(){
        System.out.println("This is random message");
        return demoServiss.getEmployeeLst();
    }
    @RequestMapping(value="/employees/{id}", method = RequestMethod.GET)
    Employee getEmployeeByID(@PathVariable int id){
        return demoServiss.getEmployeeByID(id);
    }

}
