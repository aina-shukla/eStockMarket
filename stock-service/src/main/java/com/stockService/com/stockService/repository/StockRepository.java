package com.stockService.com.stockService.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import com.stockService.com.stockService.entity.StockEntity;

@EnableMongoRepositories
@Repository
public interface StockRepository extends MongoRepository<StockEntity, Integer> {

	List<StockEntity> findAllByCompanyCodeAndStartDateAndEndDate(String companyCode, String startDate, String endDate);


}
