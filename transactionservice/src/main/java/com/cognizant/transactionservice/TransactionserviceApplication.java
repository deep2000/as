package com.cognizant.transactionservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients

@Slf4j
public class TransactionserviceApplication {

	
	public static void main(String[] args) {
		log.info("TransactionserviceApplication is started");
		SpringApplication.run(TransactionserviceApplication.class, args);
	}
	
	
	

	private ApiInfo apiInfo() {
		return new ApiInfo("Transaction Service", "Retail Banking Project", "API", "Terms of service",
				new Contact("Peoples' Bank", "", "abc@email.com"), "License of API", "", Collections.emptyList());
	}


}
