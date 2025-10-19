package com.bhv.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect1 {

   @Before("execution(public Long com.bhv.aop.service.Calculator1.add(..))")
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

   @After("execution(public Long com.bhv.aop.service.Calculator1.add(..))")
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

    @Around("execution(public Long com.bhv.aop.service.Calculator.convertUSDToINR(..)) && args(usd)")
    public Object validateAndUpdate(ProceedingJoinPoint joinPoint, Long usd) throws Throwable{
        System.out.println("Requested USD : " + usd);
        if(usd < 0)
            usd = -usd;
        Object obj = joinPoint.proceed(new Object[]{usd});
        return obj;
    }

}
