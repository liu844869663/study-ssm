package com.fullmoon.study.service.impl;

import com.fullmoon.study.dao.UserDao;
import com.fullmoon.study.model.User;
import com.fullmoon.study.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(Integer userId) {
        return userDao.queryUserById(userId);
    }
}
