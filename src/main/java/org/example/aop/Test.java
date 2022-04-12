package org.example.aop;

import org.example.aop.impl.CalImpl;
import org.example.aop.impl.CalImplNoLog;
import org.example.aop.impl.MyInvocationHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>测试主类</p>
 *
 * @author : ninggelin
 * @date : 2022-04-12 09:12
 **/
public class Test {
    public static void main(String[] args) {
        aop();
    }

    /**
     * 传统方式
     */
    private static void origin_method() {
        Cal cal = new CalImpl();
        cal.add(1, 2);
        cal.div(1, 2);
        cal.mul(1, 2);
        cal.sub(1, 2);
    }

    /**
     *
     */
    private static void dynamic_proxy() {
        Cal cal = new CalImplNoLog();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal calProxy = (Cal) myInvocationHandler.bind(cal);
        calProxy.add(1, 2);
        calProxy.div(1, 2);
        calProxy.mul(1, 2);
        calProxy.sub(1, 2);
    }

    /**
     * aop
     */
    private static void aop() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        Cal cal = (Cal) applicationContext.getBean("calImplNoLog");
        cal.add(1, 2);
        cal.div(1, 0);
        cal.mul(1, 2);
        cal.sub(1, 2);
    }
}

