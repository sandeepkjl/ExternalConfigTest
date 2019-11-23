package com.example.sandeep.externalConfigTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${region.name}")
    String envName;

    @GetMapping("/findServerName")
    public String getServerName(){
        System.out.println("master branch "+envName);
        return "master branch "+envName;
    }
}
