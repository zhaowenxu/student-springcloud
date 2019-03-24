package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author: zhaowenxu
 * @Date: 2019/3/21 20:44
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.springcloud.mapper")
@EnableEurekaClient // 将服务注册到eureka中
@EnableHystrix // 启动断路器机制
public class SpringCloudProvider {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider.class);
    }
}
