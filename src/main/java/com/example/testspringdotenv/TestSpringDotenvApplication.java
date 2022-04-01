package com.example.testspringdotenv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestSpringDotenvApplication {

    @Value("${example.name}")
    String name;

    @GetMapping("/")
    public String home() {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestSpringDotenvApplication.class, args);
    }

}
