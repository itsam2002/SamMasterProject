# Lession 2: APPLICATION.PROPERTIES OR APPLICATION.YML

If you want to keep your application.properties file outside resources then you have to specify location of that file in main class. But if you create Config folder under /src/main/resource and place your property file there then you don't need to mention. It will recognize file and load application.

@SpringBootApplication
@PropertySource("/dev/application.properties")
public class SamdurgeshdemoApplication  {

    @Autowired
    private CalcService calcService;

    public static void main(String[] args) {SpringApplication.run(SamdurgeshdemoApplication.class, args);
    }



public class MyApp {

    @Value("SamApp")
    private String myAppName;
    
    @Value("1.0")
    private int myAppVersion;
    
    @Value("MySpringBoot App")
    private String myAppDescription;
}

To get the values from application.properties

Application.properties
spring.application.name=samdurgeshdemo
spring.security.user.name=sam
spring.security.user.password=sam
myapp.name=SamApp
myapp.version=2.0


@Component
public class MyApp {

    @Value("${myapp.name}")
    private String myAppName;

    @Value("${myapp.version}")
    private double myAppVersion;

    @Value("MySpringBoot App")
    private String myAppDescription;

    public String getMyAppName() {
        return myAppName;
    }


---> To make sure it is getting value or not, you can use main class or create controller

public static void main(String[] args) {

    ConfigurableApplicationContext container = SpringApplication.run(SamdurgeshdemoApplication.class, args);
    MyApp app = container.getBean(MyApp.class);
    System.out.println(app.getMyAppName());
    System.out.println(app.getMyAppVersion());
    System.out.println(app.getMyAppDescription());
}

@RestController
public class MyController {

    @Autowired
    MyApp myapp;

    @RequestMapping("/appinfo")
    public MyApp appInfo(){
        return myapp;
    }
}