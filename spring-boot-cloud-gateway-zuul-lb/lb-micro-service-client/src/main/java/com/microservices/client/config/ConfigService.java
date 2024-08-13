package com.microservices.client.config;

//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.microservices.client.model.ResponseModel;

@FeignClient(value = "micro-service-server")
//@RibbonClient(name = "micro-service-server") // having version conflict for this reason Cloud Load Balancer is used
public interface ConfigService {
	/*
	 * Feign - HTTP client library for integrating with REST services
     * Ribbon - Load balancing, fault tolerant HTTP client
     * Hystrix - Latency and fault tolerance library that will provide a circuit breaker to help with external failures.
	*/

    @GetMapping("/server/technologyInfo/{platform}")
    ResponseModel retrieveTechnologyInfo(@PathVariable("platform") String platform);
}
