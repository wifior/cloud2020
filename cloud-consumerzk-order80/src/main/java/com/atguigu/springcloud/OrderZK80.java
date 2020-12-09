package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderZK80
 * @Description TODO
 * @Author Think
 * @Date 2020/12/9 20:45
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZK80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZK80.class,args);
    }
}
