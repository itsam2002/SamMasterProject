package com.training.SamMasterProject;

import com.training.SamMasterProject.service.Calc;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamMasterProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SamMasterProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Calc calc = new Calc();
		System.out.println(calc.add(5,10));
	}
}
