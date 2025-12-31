package com.training.SamMasterProject.Controller;

import com.training.SamMasterProject.dto.EmployeeDTO;
import com.training.SamMasterProject.Entity.Employee;
import com.training.SamMasterProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public EmployeeDTO saveEmployee(@RequestBody Employee employee){
        return employeeService.insertEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> listOfEmp(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{eid}")
    public Optional<Employee> findByEId(@PathVariable Long eid){
        return employeeService.getEmployeeById(eid);
    }
}
