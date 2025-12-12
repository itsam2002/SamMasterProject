package com.training.SamMasterProject.service;

import org.springframework.stereotype.Service;

@Service
public class Calc {
    private double num1;
    private double num2;

    public double add(double num1, double num2){
        return num1+num2;
    }
}
