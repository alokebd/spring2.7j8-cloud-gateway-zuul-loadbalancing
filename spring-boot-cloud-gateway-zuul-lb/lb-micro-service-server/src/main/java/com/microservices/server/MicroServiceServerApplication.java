package com.microservices.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceServerApplication.class, args);
	}

}
