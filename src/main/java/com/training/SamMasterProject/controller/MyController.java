package com.training.SamMasterProject.controller;

import com.training.SamMasterProject.component.MyApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyApp myapp;

    @RequestMapping("/appinfo")
    public String appInfo(){
        return myapp.toString();
    }
}
