package com.training.SamMasterProject.component;

import org.springframework.stereotype.Component;

@Component
public class Employees {

    private int employeeId;
    private String employeeName;
    private String employeeState;
    private String employeePosition;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(String employeeState) {
        this.employeeState = employeeState;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public Employees() {
    }

    public Employees(int employeeId, String employeeName, String employeeState, String employeePosition) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeState = employeeState;
        this.employeePosition = employeePosition;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeState='" + employeeState + '\'' +
                ", employeePosition='" + employeePosition + '\'' +
                '}';
    }
}

