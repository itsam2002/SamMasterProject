package com.training.SamMasterProject.controller;

import com.training.SamMasterProject.service.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    Calc calc;

    @RequestMapping("/add")
    public double add(@RequestParam double n1, @RequestParam double n2){
        return calc.add(n1, n2);
    }

    @RequestMapping("/add1/{n1}/{n2}")
    public double add1(@PathVariable double n1, @PathVariable double n2){
        return calc.add(n1, n2);
    }
}
