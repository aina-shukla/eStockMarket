package com.demo.p01springboot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.demo.controllers.CompanyController;
import com.demo.entities.CompanyEntity;
import com.demo.repository.CompanyRepository;
import com.demo.services.CompanyService;

@SpringBootTest
public class TestService {

	@MockBean
	private CompanyRepository repo;

	@Autowired
	private CompanyService service;

	@InjectMocks
	private CompanyController controller;

	@Test
	public void getCompanyPositive() {
		CompanyEntity companyEntity = new CompanyEntity();
		List<CompanyEntity> getAllCompanyDetails = new ArrayList<>();
		getAllCompanyDetails.add(companyEntity);
		Mockito.when(repo.findAll()).thenReturn(getAllCompanyDetails);
		List<CompanyEntity> getAllCompanyDetails1 = service.findAllCompany();
		Assertions.assertTrue(getAllCompanyDetails1.size() > 0);
	}

	@Test
	public void getCompanyNegative() {
		CompanyEntity companyEntity = new CompanyEntity();
		List<CompanyEntity> getAllCompanyDetails = new ArrayList<>();
		getAllCompanyDetails.add(companyEntity);
		Mockito.when(repo.findAll()).thenReturn(getAllCompanyDetails);
		List<CompanyEntity> getAllCompanyDetails1 = service.findAllCompany();
		Assertions.assertFalse(getAllCompanyDetails1.size() == 0);
	}

	@Test
	public void addCompanyPositive() {
		CompanyEntity companyEntity = new CompanyEntity("C50", "Paytm", "Aman", 5000000, "x.paytm.com", "bse");
		Mockito.when(repo.save(companyEntity)).thenReturn(companyEntity);
		CompanyEntity getAllCompanyDetails1 = service.register(companyEntity);
		Assertions.assertTrue(!getAllCompanyDetails1.equals(null));
	}

	@Test
	public void addCompanyNegative() {
		CompanyEntity companyEntity = new CompanyEntity("C50", "Paytm", "Aman", 5000000, "x.paytm.com", "nse");
		Mockito.when(repo.save(companyEntity)).thenReturn(companyEntity);
		CompanyEntity getAllCompanyDetails1 = service.register(companyEntity);
		Assertions.assertFalse(getAllCompanyDetails1.equals(null));
	}
}
