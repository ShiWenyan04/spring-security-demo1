package main.java.com.example.springsecuritydemo1.Controller;
import org.springframework.stereootype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
