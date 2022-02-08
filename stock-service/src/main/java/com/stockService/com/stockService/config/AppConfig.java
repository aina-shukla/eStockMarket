package com.stockService.com.stockService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class AppConfig extends AbstractMongoClientConfiguration {

    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017");
    }

    public @Bean MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "stockmarket");
    }

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return null;
	}
}