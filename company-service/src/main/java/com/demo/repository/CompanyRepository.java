package com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.CompanyEntity;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, String> {

	Optional<CompanyEntity> findCompanyByCompanyCode(String companyCode);

	CompanyEntity deleteCompanyByCompanyCode(String companyCode);

}
