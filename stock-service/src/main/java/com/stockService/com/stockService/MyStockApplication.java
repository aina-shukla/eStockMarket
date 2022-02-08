package com.stockService.com.stockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.stockService.com.stockService.entity.StockEntity;

@SpringBootApplication
@EnableMongoRepositories
@EnableAutoConfiguration
@ComponentScan({ "com.stockService.com.stockService.controllers" })
public class MyStockApplication implements CommandLineRunner {

	@Autowired
	MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MyStockApplication.class, args);
		System.out.println("Stock Service Started..");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(
				//To check mongodb connection 
				"Collection Exists ? " + mongoTemplate.collectionExists("stockmarket"));
		StockEntity entityObj = new StockEntity("C07");
		//mongoTemplate.insert(entityObj);
	}

}
