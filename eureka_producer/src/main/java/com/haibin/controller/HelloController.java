package com.haibin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2021年07月30日 14:24:00
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say/{name}")
    public String hello(@PathVariable("name") String name){

        return "hello "+name+"    "+new Date();

    }
}
