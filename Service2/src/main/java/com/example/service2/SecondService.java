package com.example.service2;

import org.springframework.boot.SpringApplication;

public class SecondService {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Writer.class);
        app.run();
    }
}
