package com.zhyan.eurekaservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaservice2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaservice2Application.class, args);
    }

}
