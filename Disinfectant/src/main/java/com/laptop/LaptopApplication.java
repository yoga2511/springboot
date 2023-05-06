package com.laptop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Disinfectant Database",
				version="1.1.2",
				description=" A Disinfectant Product",
				contact=@Contact(
						name="Yoga R",
						email="yogarajasekaran2003@gmail.com")
						)
				)
public class LaptopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopApplication.class, args);
		
				
				
					}

}
