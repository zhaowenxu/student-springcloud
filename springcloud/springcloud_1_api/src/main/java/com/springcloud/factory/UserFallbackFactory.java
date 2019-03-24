package com.springcloud.factory;

import com.springcloud.pojo.User;
import com.springcloud.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示对UserService进行熔断
 * @Author: zhaowenxu
 * @Date: 2019/3/23 14:54
 * @Version 1.0
 */
@Component
public class UserFallbackFactory implements FallbackFactory<UserService> {
    // 在客户端编辑熔断方法
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public List<User> findAll() {
                List<User> users = new ArrayList<>();
                users.add(new User().setId(0).setName("服务器异常!").setAge(0).setSex(""));
                return users;
            }

            @Override
            public String saveUser(User user) {
                return "服务降级后，进行熔断 " + user.getName();
            }
        };
    }
}
