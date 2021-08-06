package com.haibin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2021年08月04日 17:46:00
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable String name){
        name="rabbon"+name;
        String url="http://eureka-producer/hello/say/"+name;
        return restTemplate.getForObject(url,String.class);
    }
}
