package com.zhyan.simple.movie.feign;

import com.zhyan.simple.movie.entity.User;
import org.springframework.stereotype.Component;

/**
 * 回退类FeignClientFallback需实现Feign Client接口
 * FeignClientFallback也可以是public class，没有区别
 * @author 周立
 */
@Component
class FeignClientFallback implements UserFeignClient {
  @Override
  public User findById(String id) {
    User user = new User();
    user.setId("-1");
    user.setUsername("默认用户");
    return user;
  }
}
