package com.bbk.api.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Version 1 DevSecOps Class"; 
	}
}
