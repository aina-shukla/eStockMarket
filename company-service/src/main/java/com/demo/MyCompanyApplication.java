package com.demo;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import springfox.documentation.service.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableAutoConfiguration
@EnableKafka

public class MyCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCompanyApplication.class, args);
		System.out.println("Company app started..");
		
		 Properties properties = new Properties();
	        properties.put("bootstrap.servers", "localhost:9092");
	        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

	        KafkaProducer kafkaProducer = new KafkaProducer(properties);
	        try{
	            for(int i = 0; i < 100; i++){
	                System.out.println(i);
	                kafkaProducer.send(new ProducerRecord("devglan-log-test", Integer.toString(i), "test message - " + i ));
	            }
	        }catch (Exception e){
	            e.printStackTrace();
	        }finally {
	            kafkaProducer.close();
	        }
	       
	}

	@Bean
	public Docket swaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/v1.0/market/company/**"))
				// .paths(RequestHandlerSelectors.basePackage("com.demo"))
				.build().apiInfo(metadata());
	}

	private ApiInfo metadata() {
		return new ApiInfoBuilder().title("Welcome to company service")
				.description("Company service has all the company details").version("4.2.8")
				.license("www.company_service.url")
				.contact(new Contact("Company Service", "company-service.page", "company-service@gmail.com")).build();
	}

}
