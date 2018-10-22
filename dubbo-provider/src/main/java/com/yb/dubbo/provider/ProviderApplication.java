package com.yb.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author yangbiao
 * @Description:服务提供者的主应用类
 * @date 2018/10/22
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.yb.dubbo.common"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
