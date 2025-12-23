# SamMasterProject

Spring Boot MVC is a streamlined way to build web applications using the Model-View-Controller (MVC) pattern, with minimal configuration compared to traditional Spring MVC.

**🌱 What is Spring Boot MVC?**

• 	Spring MVC is a framework in the Spring ecosystem that follows the Model-View-Controller design pattern:
• 	Model → Represents application data.
• 	View → Handles presentation (HTML, Thymeleaf, JSP, etc.).
• 	Controller → Manages business logic and routes requests.
• 	Spring Boot integrates Spring MVC seamlessly, removing the need for complex XML or manual configuration. It auto-configures components like the DispatcherServlet, view resolvers, and message converters.

**⚡ Why Use Spring Boot with MVC?**

• 	Auto-configuration: No need to manually set up web.xml or dispatcher-servlet.xml
or .
• 	Embedded server: Comes with Tomcat/Jetty by default, so you can run apps directly with -  java -jar

• 	Starter dependencies: spring-boot-stater-web includes Spring MVC, Jackson (for JSON), and validation libraries.
• 	Rapid development: Faster setup compared to traditional Spring MVC projects.

**🛠️ Basic Example**

Here’s a simple Spring Boot MVC controller:

````
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Spring Boot MVC!");
        return "hello"; // maps to hello.html (Thymeleaf template)
    }
}
````

• @Controller	 → Marks the class as a Spring MVC controller.

• @Getmapping("/hello")	 → Maps HTTP GET requests to .
• Model	 → Passes data to the view.
• return Hello	 → Resolves to a template (e.g., hello.html in /resources/templates).

🔑 Key Features
• 	REST support: Using @RestController, endpoints return JSON by default if Jackson is on the classpath.
• 	Template engines: Supports Thymeleaf, FreeMarker, Mustache, etc.
• 	Validation: Built-in support for form validation with @Valid.
• 	Security: Easily integrated with Spring Security for authentication/authorization.

🚀 When to Use
• 	Web applications needing dynamic views (Thymeleaf, JSP).
• 	REST APIs where controllers return JSON/XML.
• 	Rapid prototyping or production-ready apps with minimal boilerplate.

### Spring Boot Thymeleaf Dependency
````
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-thymeleaf -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
    <version>4.0.0</version>
</dependency>
````