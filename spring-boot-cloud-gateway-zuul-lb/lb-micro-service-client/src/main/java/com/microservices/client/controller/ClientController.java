package com.microservices.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.client.config.ConfigService;
import com.microservices.client.model.ResponseModel;


@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ConfigService apiProxy;
    
    
    @GetMapping("/hello")
    public String hello() {
    	return "Welcome to Microservice Client";
    }
    
    @GetMapping("/technologyInfo/{platform}")
    public ResponseModel getTechnologyInfo(@PathVariable("platform") String platform) {
        // API calling using proxy interface and mapping into ResponseModel named Object.
        ResponseModel responseModel = apiProxy.retrieveTechnologyInfo(platform);

        return responseModel;
    }
}
