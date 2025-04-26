package com.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkoutController {

    @GetMapping("/Workout")
    public String workout() {
        return "workout";  // This tells Spring Boot to look for workout.html in /templates
    }
}
