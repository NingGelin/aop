package org.example.aop.staticProxy;

/**
 * 测试静态代理主类
 *
 * @author ninggelin
 * @date 2022-04-12 10:43:34
 */
public class Client {

    public static void main(String[] args) {
        UserLogProxy userLogProxy = new UserLogProxy();
        userLogProxy.doSomething();
    }
}