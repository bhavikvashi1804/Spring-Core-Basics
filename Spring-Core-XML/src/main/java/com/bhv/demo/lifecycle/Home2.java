package com.bhv.demo.lifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Home2 {
    private String name;
    @PostConstruct
    public void init() {
        System.out.println("init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy method");
    }
}
