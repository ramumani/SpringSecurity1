package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return "from home - Access to ALL";
	}

	@GetMapping("/user")
	public String user() {
		return "from user - Access to User and Admin";
	}

	@GetMapping("/transfers/viewpayments")
	public String viewpayments() {
		return "from viewpayments - Access to User";
	}

	@GetMapping("/admin")
	public String admin() {
		return "from admin - Access to only Admin";
	}

}
