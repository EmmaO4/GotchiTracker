package com.springboot.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {

	@GetMapping("/Welcome")
	public String welcome() {
		return "gotchi tracker test";
		
	}
	
}
