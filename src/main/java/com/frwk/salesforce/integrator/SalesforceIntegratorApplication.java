package com.frwk.salesforce.integrator;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SalesforceIntegratorApplication {

	@Bean
	@Scope("singleton")
	public ModelMapper modelMapper() throws Exception {
		return new ModelMapper();
	}


	public static void main(String[] args) {
		SpringApplication.run(SalesforceIntegratorApplication.class, args);
	}

}