package com.haibin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName EurekaConsumerFeignApplication.java
 * @Description TODO
 * @createTime 2021年08月05日 10:08:00
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class EurekaConsumerFeignApplication{

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignApplication.class);
    }
}
