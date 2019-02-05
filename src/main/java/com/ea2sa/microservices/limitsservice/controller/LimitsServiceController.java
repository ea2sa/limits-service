package com.ea2sa.microservices.limitsservice.controller;


import com.ea2sa.microservices.limitsservice.configuration.Configuration;
import com.ea2sa.microservices.limitsservice.configuration.LimitsConfiguration;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsServiceController {

    @Autowired
    private Configuration configuration;

    @RequestMapping("/limits")
    public LimitsConfiguration retrieveLimits(){

    return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
