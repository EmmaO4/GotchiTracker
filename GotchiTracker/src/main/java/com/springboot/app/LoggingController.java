package com.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Using @Controller to render views
public class LoggingController {

    @GetMapping("/Logging")
    public String logging() {
        return "logging";  // Spring looks for logging.html in /templates
    }
}
