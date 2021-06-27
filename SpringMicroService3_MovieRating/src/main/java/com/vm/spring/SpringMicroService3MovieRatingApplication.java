package com.vm.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMicroService3MovieRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroService3MovieRatingApplication.class, args);
	}

}
