package com.zhyan.simple.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerMovieFeignHystrixApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerMovieFeignHystrixApplication.class, args);
  }
}
