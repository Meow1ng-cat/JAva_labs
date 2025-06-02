package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.sql.Wrapper;

@Configuration
@ComponentScan("com.example.demo")
@EnableWebMvc
public class Config implements WebMvcConfigurer {
    private final ApplicationContext applicationContext;

    @Autowired
    public Config(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public WorkerInfo programmer() {
        return new WorkerInfo("Bill", "Gates", 200000, 8);
    }
    @Bean
    public WorkerInfo builder() {
        return new WorkerInfo("Bob","Builder",10000,12);
    }
    @Bean
    public WorkerInfo guard() {
        return new WorkerInfo("John","Cena",25000,10);
    }
}
