package com.Suresh.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String homePage() {
		return "homepage";
	}
	
	@GetMapping("/loan")
	public String loanPage() {
		return "loanpage";
	}
	
	@GetMapping("/statement")
	public String statementPage() {
		return "statementpage";
	}
	
	@GetMapping("/contact")
	public String contactPage() {
		return "contactpage";
	}
}
