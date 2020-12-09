package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author Think
 * @Date 2020/12/1 17:59
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {


    @Value("{server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String result(){
        return "springcloud with consul: "+serverPort +"\t"+ UUID.randomUUID().toString();
    }
}
