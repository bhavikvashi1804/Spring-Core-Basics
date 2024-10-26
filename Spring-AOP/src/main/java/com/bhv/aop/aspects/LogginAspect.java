package com.bhv.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LogginAspect {

    @Before("")
    public void logBefore(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("Class Name : " + className);
        System.out.println("Method Name : " + methodName);
        for (Object arg : args) {
            System.out.println("arg : " + arg);
        }
    }

    @After("")
    public void logAfter(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("Class Name : " + className);
        System.out.println("Method Name : " + methodName);
        for (Object arg : args) {
            System.out.println("arg : " + arg);
        }
    }

}
