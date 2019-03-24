package com.jt.springcloud.controller;

import com.springcloud.pojo.User;
import com.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

	//private static final String provider_url = "http://localhost:8000";
	//private static final String provider_url = "http://PROVIDER-USER";
	// SpringCloud基于http协议-REST结构
	//@Autowired
	//private RestTemplate restTemplate;

	/*
	@SuppressWarnings("unchecked")	//压制警告
	@RequestMapping("/findAll")
	public List<User> findAll(){
		// 参数一：访问的服务端路径
		// 参数二：返回数据的类型
		return restTemplate.getForObject(provider_url+"/findAll", List.class);
	}

	// 实现用户信息新增
	@RequestMapping("/saveUser/{name}/{age}/{sex}")
	public String saveUser(User user){
		/**
		 * 参数介绍
		 * 1. url访问服务端url路径
		 * 2. request 传递的参数 json数据
		 * 3. 服务端返回的数据类型
		 */
	/*
		return restTemplate.postForObject(provider_url + "/saveUser", user, String.class);
	}
	*/
	//通过接口调用
	// SOA中立方式定义
	@Autowired
	private UserService userService;

	// 实现用户信息新增
	@RequestMapping("/saveUser/{name}/{age}/{sex}")
	public String saveUser(User user){
		return userService.saveUser(user);
	}

	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
}
