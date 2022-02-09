package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.CompanyEntity;
import com.demo.services.CompanyService;

@RestController
@RequestMapping("/api/v1.0/market/company/")
public class CompanyController {

	@Autowired
	CompanyService companyService;

	// Test
	@GetMapping()
	public String hello() {
		return "Company service";
	}

	// Register a new company
	@PostMapping("/register")
	public CompanyEntity registerNewCompany(@RequestBody CompanyEntity companyEntity) {
		return companyService.register(companyEntity);
	}

	// Fetches the Company Details
	@GetMapping("info/{companyCode}")
	public CompanyEntity getCompanyDetails(@PathVariable String companyCode){
		return companyService.findCompanyDetails(companyCode);
	}
	
	//Fetches all the Company Details
	@GetMapping("/getall")   
	public List<CompanyEntity> getAllCompanyDetails(){
		return companyService.findAllCompany();
	}
	
	//Deletes a company
	@DeleteMapping("delete/{companyCode}")
	public void deleteCompany(@PathVariable String companyCode) {
		companyService.deleteCompany(companyCode);
	}

}
