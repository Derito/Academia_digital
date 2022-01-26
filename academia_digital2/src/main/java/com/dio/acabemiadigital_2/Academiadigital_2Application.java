package com.dio.acabemiadigital_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EntityScan(basePackages = "com.dio.acabemiadigital_2.entity")

@ComponentScan(basePackages= {"com.dio.acabemiadigital_2"})
@SpringBootApplication
public class Academiadigital_2Application {

    public static void main(String[] args) {
        SpringApplication.run(Academiadigital_2Application.class, args);
    }

}
