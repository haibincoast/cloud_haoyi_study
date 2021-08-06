package com.haibin.feign;

import com.haibin.hystrix.HelloFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName HelloFign.java
 * @Description TODO
 * @createTime 2021年08月05日 10:09:00
 */
@FeignClient(name = "eureka-producer",fallback = HelloFeignHystrix.class)
public interface HelloFeign {

    @GetMapping("/hello/say/{name}")
     String hello(@PathVariable("name") String name);
}
