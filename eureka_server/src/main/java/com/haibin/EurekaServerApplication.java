package com.haibin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName EurekaServerApplication.java
 * @Description TODO
 * @createTime 2021年07月30日 10:44:00
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServerApplication.class);
    }
}
