package org.example.aop.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * <p>动态代理</p>
 *
 * @author : ninggelin
 * @date : 2022-04-12 09:18
 **/
public class MyInvocationHandler implements InvocationHandler {
    /**
     * 接收委托对象
     */
    private Object object;

    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("%s方法的参数是 %s\n", method.getName(), Arrays.toString(args));
        Object result = method.invoke(object, args);
        System.out.printf("%s方法的结果是 %s\n\n", method.getName(), result);
        return result;
    }
}
