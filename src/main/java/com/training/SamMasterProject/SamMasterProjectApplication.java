package com.training.SamMasterProject;

import com.training.SamMasterProject.component.MyApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SamMasterProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SamMasterProjectApplication.class, args);
		MyApp myapp = container.getBean(MyApp.class);
		System.out.println("My App Name: " + myapp.getMyAppName());
		System.out.println("My App Version: " + myapp.getMyAppVersion());
		System.out.println("My App Author: " + myapp.getMyAppAuthor());
	}

}
