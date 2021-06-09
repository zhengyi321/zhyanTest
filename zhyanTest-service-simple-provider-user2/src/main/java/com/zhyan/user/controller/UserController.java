package com.zhyan.user.controller;

import com.zhyan.user.dao.UserRepository;
import com.zhyan.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*******
 *
 *
 * author:zhyan
 *
 * createtime:2021/5/8
 *
 * description:用户接口
 *
 *
 *******/
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable String id){
        User user = userRepository.findOne(id);
//        User user = new User();
//        user.setAge(11);
//        user.setUsername("zz");
//        user.setId(1L);
        return user;
    }
    @GetMapping("/save")
    public User saveUser() {
        User user = new User();
        user.setAge(11);
        user.setUsername("aa");
        userRepository.save(user);
//        user.setId(1L);
        return user;
    }
}
