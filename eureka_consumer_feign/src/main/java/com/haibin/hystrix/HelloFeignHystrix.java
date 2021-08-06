package com.haibin.hystrix;

import com.haibin.feign.HelloFeign;
import org.springframework.stereotype.Component;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName HelloFeignHystrix.java
 * @Description TODO
 * @createTime 2021年08月05日 11:11:00
 */
@Component
public class HelloFeignHystrix implements HelloFeign {

    @Override
    public String hello(String name) {
        return "提供方奔溃了！！！，我要取缓存中的值了，，取出来了，哈哈哈";
    }
}
