# SamMasterProject

# Lession 4 - RequestParam & PathVariable

````
@Service
public class Calc {
private double num1;
private double num2;

    public double add(double num1, double num2){
        return num1+num2;
    }
}

@RestController
public class MyController {
    
    @Autowired
    Calc calc;
    
    @RequestMapping("/add")
    public double add(@RequestParam double n1, @RequestParam double n2){
        return calc.add(n1, n2);        
    }
}

http://localhost:8080/add?n1=10&n2=10

    @RequestMapping("/add1/{n1}/{n2}")
    public double add1(@PathVariable double n1, @PathVariable double n2){
        return calc.add(n1, n2);
    }

http://localhost:8080/add1/5/150