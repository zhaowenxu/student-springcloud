package com.springcloud.service.impl;

import com.springcloud.mapper.UserMapper;
import com.springcloud.pojo.User;
import com.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhaowenxu
 * @Date: 2019/3/21 20:36
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
