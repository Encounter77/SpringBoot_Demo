package com.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    public String test(){
        return "hello spring-boot";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test1(){
        return "hello spring-boot1";
    }


    public static void main(String args []) throws Exception{
        SpringApplication.run(TestController.class,args);
    }
}
