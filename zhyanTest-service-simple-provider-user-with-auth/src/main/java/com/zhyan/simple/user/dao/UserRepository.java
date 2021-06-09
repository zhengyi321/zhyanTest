package com.zhyan.simple.user.dao;

import com.zhyan.simple.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*******
 *
 *
 * author:zhyan
 *
 * createtime:2021/5/8
 *
 * description:操作层
 *
 *
 *******/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
