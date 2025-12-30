package com.training.SamMasterProject.Service;

import com.training.SamMasterProject.Entity.Employee;
import com.training.SamMasterProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee insertEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

}
