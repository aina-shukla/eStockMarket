package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/market/company/")
public class CompanyController {

	@GetMapping()
	public String getAllBooks() {
		return "Company service";
	}

}
