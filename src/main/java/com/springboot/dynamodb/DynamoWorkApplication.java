package com.springboot.dynamodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//lombok annotation for logger
@Slf4j
//spring annotation
@SpringBootApplication
public class DynamoWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamoWorkApplication.class, args);
        log.info("Dynamo DB Integration application started successfully.");
    }
}
