package com.sip.ams.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sip.ams.entities.AuthenticationBean;

@CrossOrigin(origins="*")
@RestController
public class BasicAuthRestController {
	@GetMapping("/basicauth")
	/*public AuthenticationBean basicauth() {
		return new AuthenticationBean("You are authenticated");
	}*/
	
	public String basicauth() {
		return "You are authenticated";
	}
}