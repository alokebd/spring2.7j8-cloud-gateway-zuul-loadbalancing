package com.microservices.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients("com.microservices.client")
@EnableDiscoveryClient
public class MicroServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceClientApplication.class, args);
    }

}
