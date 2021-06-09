package com.zhyan.simple.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerMovieFeignManualApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerMovieFeignManualApplication.class, args);
  }
}
