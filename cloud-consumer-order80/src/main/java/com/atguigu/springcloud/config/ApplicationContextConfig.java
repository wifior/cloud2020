package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Author Think
 * @Date 2020/12/1 19:18
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
  // @LoadBalanced  //使用loadbalanced注解赋予resttemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
