package com.example.service1;

import org.springframework.boot.SpringApplication;

public class FirstService {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ScheduleGenerator.class);
        app.run();
    }
}
