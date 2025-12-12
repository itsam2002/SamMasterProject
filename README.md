# SamMasterProject

# Lession 3 - CommandLineRunner

The Spring Boot CommandLineRunner is a functional interface used to execute specific code immediately after the application context is fully initialized but before the SpringApplication.run() method is complete. This allows you to run startup tasks, such as database seeding or initialization logic, using all of Spring's features like dependency injection.

### Key Features and Usage

#### Execution Timing: 

The run method is executed once all beans are created and the application context is ready.

#### Dependency Injection: 

Since the runner is a Spring bean, you can @Autowire other beans and use Spring's inversion of control container within the run method.

#### Access Arguments: 

The run(String... args) method receives the raw command-line arguments passed to the application.

#### Multiple Runners: 

You can define multiple CommandLineRunner beans, and their execution order can be managed using the @Order annotation or by implementing the Ordered interface.

#### Alternative: The ApplicationRunner interface serves a similar purpose but accepts arguments as a more structured ApplicationArguments object, which provides access to named options and non-option arguments.

#### Example Implementation

You can implement the CommandLineRunner in your main application class or a separate @Component class. 

````
@Service
public class Calc {
private double num1;
private double num2;

    public double add(double num1, double num2){
        return num1+num2;
    }
}

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

