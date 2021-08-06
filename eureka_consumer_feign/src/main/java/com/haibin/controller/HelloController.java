package com.haibin.controller;

import com.haibin.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2021年08月05日 10:11:00
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloFeign helloFeign;

    @GetMapping("/say/{name}")
    public String hello(@PathVariable String name){
        name=name+"fign";
        return helloFeign.hello(name);
    }
}
