package com.haibin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName HystrixDashboardActuatorApplication.java
 * @Description TODO
 * @createTime 2021年08月05日 15:18:00
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardActuatorApplication{

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardActuatorApplication.class);
    }
}
