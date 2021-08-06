package com.haibin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName RestTemplateConfig.java
 * @Description TODO
 * @createTime 2021年07月30日 14:56:00
 */
@Configuration
public class RestTemplateConfig {

    @Bean(name = "restTemplate")
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
