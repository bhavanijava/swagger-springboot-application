package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;



@SpringBootApplication
@OpenAPIDefinition(info=@Info(description = "Swaggwer Application"))
public class SwaggerApplicationSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplicationSbApplication.class, args);
    }

 
}
