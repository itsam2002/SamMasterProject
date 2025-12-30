package com.training.SamMasterProject.Controller;

import com.training.SamMasterProject.Entity.Employee;
import com.training.SamMasterProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.insertEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> listOfEmp(){
        return employeeService.getEmployees();
    }
}
