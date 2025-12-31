package com.training.SamMasterProject.dto;

import com.training.SamMasterProject.Entity.Employee;

public class EmployeeDTO {

    Employee employee;
    String message;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EmployeeDTO(Employee employee, String message) {
        this.employee = employee;
        this.message = message;
    }

    public EmployeeDTO() {
    }
}
