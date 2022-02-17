package com.loljoa.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LoljoaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoljoaServerApplication.class, args);
    }

}
