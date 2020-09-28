package com.fullmoon.study.dao;

import com.fullmoon.study.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    User queryUserById(Integer userId);

    List<User> queryUserByName(@Param("param") String param);

    int updateUserById(User user);
}
