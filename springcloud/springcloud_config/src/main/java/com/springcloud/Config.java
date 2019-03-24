package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: zhaowenxu
 * @Date: 2019/3/23 23:05
 * @Version 1.0
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class, RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class})//排除数据源启动,否则会报错
@EnableConfigServer        //开启配置中心设置
public class Config {
    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
}
