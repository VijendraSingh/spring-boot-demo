package com.example.myfirstbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.example.myfirstbootapp")
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.myfirstbootapp.model")
public class MyfirstbootappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfirstbootappApplication.class, args);
    }

}
