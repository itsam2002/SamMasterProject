package com.training.SamMasterProject.Service;

import com.training.SamMasterProject.Exceptions.EidNotfound;
import com.training.SamMasterProject.dto.EmployeeDTO;
import com.training.SamMasterProject.Entity.Employee;
import com.training.SamMasterProject.Exceptions.AddressException;
import com.training.SamMasterProject.Exceptions.SalaryException;
import com.training.SamMasterProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

//    public Employee insertEmployee(Employee employee){
//        return employeeRepository.save(employee);
//    }

    public EmployeeDTO insertEmployee(Employee employee){

        if(employee.getEsalary()<50000){
            throw new SalaryException("Salary can't be less than 50000");
        }

        if(!employee.getEaddress().equals("NY")){
            throw new AddressException("Employee must be from NY");
        }

        else{
            Employee EResponse = employeeRepository.save(employee);
            return new EmployeeDTO(EResponse, "Record Inserted Successfully");
        }
    }

    public List<Employee> getEmployees(){
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    public Optional<Employee> getEmployeeById(Long empid){

        Optional<Employee> empbyid = employeeRepository.findById(empid);

        if(!empbyid.isPresent()){
            throw new EidNotfound("Employee Not present in DB");
        }
        return employeeRepository.findById(empid);
    }
}
