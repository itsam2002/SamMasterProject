package com.training.SamMasterProject.controller;

import com.training.SamMasterProject.component.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    @Autowired
    Employees employees;

    //For one Employee only
    @GetMapping("/empinfo")
    public Employees getEmployeeInfo(){
        Employees employees = new Employees(1, "Sam", "NY", "CEO");
        return employees;
    }

    //For all Employees
    @GetMapping("/empinfoall")
    public ArrayList<Employees> getEmployeesInfo(){
        ArrayList<Employees> employeesArrayList = new ArrayList<Employees>();
        Employees employees1 = new Employees(1, "Sam", "NY", "CEO");
        Employees employees2 = new Employees(2, "Dipi", "CT", "VP");
        Employees employees3 = new Employees(3, "Vraj", "TX", "Director");
        Employees employees4 = new Employees(4, "Jiyaan", "NJ", "Manager");
        employeesArrayList.add(employees1);
        employeesArrayList.add(employees2);
        employeesArrayList.add(employees3);
        employeesArrayList.add(employees4);
        return employeesArrayList;
    }

    //For particular Employee with PathVariable
    @GetMapping("/empinfoall/{name}")
    public ArrayList<Employees> getEmployeesInfoPathVariable(@PathVariable String name){
        ArrayList<Employees> employeesArrayList = new ArrayList<Employees>();
        System.out.println(name);
        if(name.equals("sam")){
            employeesArrayList.add(new Employees(1, "Sam", "NY", "CEO"));
        } else if (name.equals("dipi")) {
            employeesArrayList.add(new Employees(2, "Dipi", "CT", "VP"));
        } else if (name.equals("vraj")) {
            employeesArrayList.add(new Employees(3, "Vraj", "TX", "Director"));
        } else if (name.equals("jiyaan")) {
            employeesArrayList.add(new Employees(4, "Jiyaan", "NJ", "Manager"));
        } else {
            return null;
        }
        return employeesArrayList;
    }

    //For particular Employee with RequestParam - http://localhost:8080/empinfoallrequestparam?name=sam
    @GetMapping("/empinfoallrequestparam")
    public ArrayList<Employees> getEmployeesInfoRequestParam(@RequestParam (value = "name", required = false) String name){
        ArrayList<Employees> employeesArrayList = new ArrayList<Employees>();
        System.out.println(name);
        if(name.equals("sam")){
            employeesArrayList.add(new Employees(1, "Sam", "NY", "CEO"));
        } else if (name.equals("dipi")) {
            employeesArrayList.add(new Employees(2, "Dipi", "CT", "VP"));
        } else if (name.equals("vraj")) {
            employeesArrayList.add(new Employees(3, "Vraj", "TX", "Director"));
        } else if (name.equals("jiyaan")) {
            employeesArrayList.add(new Employees(4, "Jiyaan", "NJ", "Manager"));
        } else {
            return null;
        }
        return employeesArrayList;
    }

    //For particular Employee with multiple PathVariable
    @GetMapping("/empinfoall/{name}/{id}")
    public ArrayList<Employees> getEmployeesInfoChoice(@PathVariable String name, @PathVariable int id){
        ArrayList<Employees> employeesArrayList = new ArrayList<Employees>();
        System.out.println(id + ":" +name);
        if(name.equalsIgnoreCase("sam") && id==1){
            employeesArrayList.add(new Employees(1, "Sam", "NY", "CEO"));
        } else if (name.equalsIgnoreCase("dipi")) {
            employeesArrayList.add(new Employees(2, "Dipi", "CT", "VP"));
        } else if (name.equalsIgnoreCase("vraj")) {
            employeesArrayList.add(new Employees(3, "Vraj", "TX", "Director"));
        } else if (name.equalsIgnoreCase("jiyaan")) {
            employeesArrayList.add(new Employees(4, "Jiyaan", "NJ", "Manager"));
        } else {
            return null;
        }
        return employeesArrayList;
    }
}
