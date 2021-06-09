package com.zhyan.movies.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhyan.movies.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
  private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private LoadBalancerClient loadBalancerClient;

  @HystrixCommand(fallbackMethod = "findByIdFallback")
  @GetMapping("/user/{id}")
  public User findById(@PathVariable String id) {
    return this.restTemplate.getForObject("http://zhyanTest-provider-user/" + id, User.class);
  }

  public User findByIdFallback(String id,Throwable throwable){
    LOGGER.error("进入回退方法,异常:",throwable);
    User user = new User();
    user.setId("-1");
    user.setName("默认用户");
    return user;
  }


  @GetMapping("/save")
  public User saveUser() {
    return this.restTemplate.getForObject("http://zhyanTest-provider-user/save", User.class);
  }

  @GetMapping("/log-user-instance")
  public void logUserInstance() {
    ServiceInstance serviceInstance = this.loadBalancerClient.choose("zhyanTest-provider-user");
    // 打印当前选择的是哪个节点
    MovieController.LOGGER.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
  }
}
