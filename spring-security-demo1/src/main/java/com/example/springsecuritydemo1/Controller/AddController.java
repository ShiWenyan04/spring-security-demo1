package main.java.com.example.springsecuritydemo1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddController {
    @GetMapping("/add")
    public String ad(){
        return "add";
    }
}
