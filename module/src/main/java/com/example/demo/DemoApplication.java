package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Random;

@SpringBootApplication
@ComponentScan("org.olegus.types;org.olegus85.javainterview")
public class DemoApplication {
    @Bean
    public Random random() {
        return new Random();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }
}


