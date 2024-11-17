package com.bhv.aop.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;

@Configurable
@ComponentScan(basePackages = "com.bhv.aop")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    String appName(){
        return "Spring AOP Demo";
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
