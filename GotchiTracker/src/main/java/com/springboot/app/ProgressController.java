package com.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgressController {

	@GetMapping("/Progress")
	public String progress() {
		return "progress";
	}
}
