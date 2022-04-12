package org.example.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <p>日志切面</p>
 *
 * @author : ninggelin
 * @date : 2022-04-12 09:52
 **/
@Aspect
@Component
public class LoggerAspect {

    @Before(value = "execution(public int org.example.aop.impl.CalImplNoLog.*(..))")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.printf("%s方法请求参数: %s\n", methodName, args);
    }

    @After(value = "execution(public int org.example.aop.impl.CalImplNoLog.*(..))")
    public void after(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "方法执行完毕");
    }

    @AfterReturning(value = "execution(public int org.example.aop.impl.CalImplNoLog.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "方法的结果是" + result);
    }

    @AfterThrowing(value = "execution(public int org.example.aop.impl.CalImplNoLog.*(..))", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "方法抛出异常" + exception);
    }
}
