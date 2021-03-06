package com.httpserver.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = { "com.httpserver.contentprovider,com.httpserver.service,com.httpserver.boot" })
public class WebInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebInitializer.class, args);
    }

}
