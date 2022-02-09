package com.stockService.com.stockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.stockService.com.stockService.entity.StockEntity;

//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableMongoRepositories
@EnableAutoConfiguration
//@EnableSwagger2
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
	
//	@Bean
//	public Docket swaggerConfig(){
//		return new Docket(DocumentationType.SWAGGER_2)
//			.select()
//			.paths(PathSelectors.ant("/api/v1.0/market/stock/**"))
//		    //.paths(RequestHandlerSelectors.basePackage("com.demo"))
//			.build()
//			.apiInfo(metadata())
//			;
//	}
//	
//	private ApiInfo metadata(){
//		return new ApiInfoBuilder()
//			.title("Welcome to stock service")
//			.description("Stock service has all the stock details")
//			.version("4.2.9")
//			.license("www.stock_service.url")
//			.contact(new Contact("Stock Service", "stock-service.page", "stock-service@gmail.com"))
//			.build();
//	}

}
