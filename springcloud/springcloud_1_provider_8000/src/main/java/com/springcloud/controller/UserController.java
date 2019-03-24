package com.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.pojo.User;
import com.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaowenxu
 * @Date: 2019/3/21 20:37
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询全部用户信息 测试demo
     * @return
     */
    @RequestMapping("/findAll")
    // 当服务发生异常/返回错误数据时,执行熔断方法
    @HystrixCommand(fallbackMethod = "hystrixFindAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    public List<User> hystrixFindAll(){
        List<User> users = new ArrayList<>();
        users.add(new User().setId(0).setName("服务器异常!").setAge(0).setSex(""));
        return users;
    }

    // 实现用户入库
    @RequestMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        userService.saveUser(user);
        return "用户新增完成:" + user.getName();
    }
}
