package com.springcloud.service;

import com.springcloud.factory.UserFallbackFactory;
import com.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: zhaowenxu
 * @Date: 2019/3/23 10:21
 * @Version 1.0
 */
@FeignClient(value = "provider-user", fallbackFactory = UserFallbackFactory.class)
public interface UserService {
    @RequestMapping("/findAll")
    public List<User> findAll();

    @RequestMapping("/saveUser")
    public String saveUser(@RequestBody User user);
}
