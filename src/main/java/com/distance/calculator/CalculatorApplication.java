package com.distance.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration(){
		return  new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/distance-calculator/*"))
				.apis(RequestHandlerSelectors.basePackage("com.distance.calculator"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails(){
		return  new ApiInfo(
				"Distance calculator API",
				"Sample API for WoodWing",
				"1.0",
				"Free to use",
				new Contact("Jasim Aboobacker","https://test.com","jasim.aboobacker@gmail.com"),
				"ÄPI License",
				"http://test.com",
				Collections.emptyList()
		);
	}
}
