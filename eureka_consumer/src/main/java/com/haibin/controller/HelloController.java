package com.haibin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2021年07月30日 14:55:00
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/say/{name}")
    public String hello(@PathVariable("name") String name){
        ServiceInstance instance=loadBalancerClient.choose("eureka-producer");
        name="loadBalancerClient"+name;
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/say/" + name;
        return restTemplate.getForObject(url, String.class);
    }
}
