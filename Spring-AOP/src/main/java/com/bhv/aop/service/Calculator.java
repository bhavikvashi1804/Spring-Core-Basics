package com.bhv.aop.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public Long add(Long a, Long b) {
        return a + b;
    }

}
