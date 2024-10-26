package com.bhv.aop.aspects;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogginAspect {

    @Before("execution(public Long com.bhv.aop.service.Calculator.add(..))")
    public void logBefore(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Before Aspect");
        System.out.println("Class Name : " + className);
        System.out.println("Method Name : " + methodName);
        for (Object arg : args) {
            System.out.println("arg : " + arg);
        }
    }

    @After("execution(public Long com.bhv.aop.service.Calculator.add(..))")
    public void logAfter(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("After Aspect");
        System.out.println("Class Name : " + className);
        System.out.println("Method Name : " + methodName);
        for (Object arg : args) {
            System.out.println("arg : " + arg);
        }
    }

}
