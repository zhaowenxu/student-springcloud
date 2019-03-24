package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 1. pom.xml文件中添加Jar包
 * 2. 编辑yml文件
 * 3. 编辑启动项
 * @Author: zhaowenxu
 * @Date: 2019/3/21 21:38
 * @Version 1.0
 */
// 启动时不加载数据源配置
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer // 启动Eureka服务
public class SpringCloudEureka {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka.class);
    }
}
