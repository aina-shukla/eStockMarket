package com.stockService.com.stockService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.stockService.com.stockService.entity.StockEntity;

@SpringBootApplication
@EnableMongoRepositories
@EnableAutoConfiguration
@EnableEurekaClient
@ComponentScan({ "com.stockService.com.stockService.controllers", "com.stockService.com.stockService.services" })
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
				"Collection Exists ? " + mongoTemplate.collectionExists("mycollection"));
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Calendar cal = Calendar.getInstance();
//		//System.out.println(dateFormat.format(cal.getTime()));
//		StockEntity entityObj = new StockEntity(1,"C01", 1768.90, "NSE", dateFormat.format(cal.getTime()) );
//		mongoTemplate.insert(entityObj);
	}

}
