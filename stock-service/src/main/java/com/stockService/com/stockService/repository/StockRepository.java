package com.stockService.com.stockService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stockService.com.stockService.entity.StockEntity;

public interface StockRepository extends MongoRepository<StockEntity, String> {

}
