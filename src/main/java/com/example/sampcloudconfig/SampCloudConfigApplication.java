package com.example.sampcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SampCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampCloudConfigApplication.class, args);
    }

}
