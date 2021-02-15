package com.api.aws.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan("com.api.aws.java")
public class JavaSwaggerGuiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSwaggerGuiaApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate(); 
	}
}
