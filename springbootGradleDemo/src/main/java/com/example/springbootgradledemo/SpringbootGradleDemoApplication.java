package com.example.springbootgradledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootGradleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGradleDemoApplication.class, args);
        System.out.println("Hello, Gradle!");
    }
}
