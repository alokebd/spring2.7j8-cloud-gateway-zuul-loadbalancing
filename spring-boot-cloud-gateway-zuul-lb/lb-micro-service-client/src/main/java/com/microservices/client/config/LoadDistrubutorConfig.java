package com.microservices.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(value = "micro-service-server")
public class LoadDistrubutorConfig {

	@LoadBalanced
	@Bean
	public Feign.Builder feignBuilder() {

		return Feign.builder();
	}
}
