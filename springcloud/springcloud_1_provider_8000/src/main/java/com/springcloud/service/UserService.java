package com.springcloud.service;

import com.springcloud.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void saveUser(User user);
}
