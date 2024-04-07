package com.boa.crs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoaCrsEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaCrsEurekaserverApplication.class, args);
	}

}
