# SamMasterProject

In Spring Boot,  is used to tell the framework which packages to scan for beans (classes annotated with , , , or ). By default, Spring Boot scans the package of the main application class and its sub-packages, but you can customize it with .

🔑 Key Points About
• 	Default behavior: If you don’t specify anything, Spring Boot scans the package of your  class and all its sub-packages.
• 	Customization: You can explicitly define packages to scan using .
• 	Purpose: Ensures that Spring automatically detects and registers beans in the application context.

📘 Example 1: Default Scanning

👉 In this case, Spring Boot will scan  (the package of ) and all its sub-packages.

````
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // includes @ComponentScan by default
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
````

📘 Example 2: Custom Package Scanning

👉 Here, Spring Boot will scan only  and  for beans.

````
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.services", "com.example.repositories"})
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
````

📘 Example 3: Using Filters
You can also include/exclude specific classes:

👉 This scans  but only includes beans with  and excludes those annotated with .

````
@ComponentScan(
    basePackages = "com.example",
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyCustomAnnotation.class),
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Deprecated.class)
)
````

✅ Best Practice
• 	Keep your main application class at the root package so that default scanning covers all sub-packages.
• 	Use explicit  only when your beans are outside the default package structure.
