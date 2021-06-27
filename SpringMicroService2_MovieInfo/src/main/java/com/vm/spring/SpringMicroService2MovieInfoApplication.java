package com.vm.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMicroService2MovieInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroService2MovieInfoApplication.class, args);
	}

}
