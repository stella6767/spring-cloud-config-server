package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigserverApplication {

    /**
     * github action test
     * @param args
     */


    public static void main(String[] args) {
        SpringApplication.run(ConfigserverApplication.class, args);
    }

}
