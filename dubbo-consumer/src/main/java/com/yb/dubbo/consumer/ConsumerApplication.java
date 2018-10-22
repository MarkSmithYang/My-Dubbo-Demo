package com.yb.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yangbiao
 * @Description:服务消费者的主应用类
 * @date 2018/10/22
 */
@ImportResource(locations = {"classpath:application.properties"})
@ComponentScan(basePackages = "com.yb.dubbo.consumer")
@SpringBootApplication
@EnableDubbo
@EntityScan(basePackages = {"com.yb.dubbo.common"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
