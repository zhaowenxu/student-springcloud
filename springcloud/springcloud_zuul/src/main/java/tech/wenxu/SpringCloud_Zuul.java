package tech.wenxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: zhaowenxu
 * @Date: 2019/3/23 17:05
 * @Version 1.0
 */

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy // 添加Zuul的支持
public class SpringCloud_Zuul {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_Zuul.class, args);
    }
}
