package com.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.demo.service")
@EnableDubbo
public class StartDemoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartDemoProviderApplication.class,args);
    }
}
