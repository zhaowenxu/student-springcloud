package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableEurekaClient
// 引入fegin的支持
@EnableFeignClients("com.springcloud.service")
@EnableHystrix
public class SpringCloud_Consumer {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud_Consumer.class, args);
	}
}
