package com.microservices.client.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.client.model.ResponseModel;


@FeignClient(name = "api-gateway-server")
@RibbonClient(name = "micro-service-server")
public interface ApiProxy {

    @GetMapping("micro-service-server/server/technologyInfo/{platform}")
    ResponseModel retrieveTechnologyInfo(@PathVariable("platform") String platform);
}
