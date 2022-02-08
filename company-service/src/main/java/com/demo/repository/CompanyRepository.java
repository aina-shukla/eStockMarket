package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, String> {

}
