package com.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GotchiController {

    @GetMapping("/Gotchi")
    public String gotchi() {
        return "gotchi";  // This tells Spring Boot to look for workout.html in /templates
    }
}
