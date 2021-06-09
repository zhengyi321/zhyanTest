package com.zhyan.user.dao;

import com.zhyan.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
public interface UserRepository extends JpaRepository<User,String> {
}
