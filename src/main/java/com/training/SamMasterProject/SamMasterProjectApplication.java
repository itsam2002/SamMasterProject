package com.training.SamMasterProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"test.TestPackage", "com.training.SamMasterProject"})
public class SamMasterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamMasterProjectApplication.class, args);
	}

}
