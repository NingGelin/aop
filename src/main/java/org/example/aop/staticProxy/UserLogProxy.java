package org.example.aop.staticProxy;

/**
 * 用户服务代理类
 *
 * @author ninggelin
 * @date 2022-04-12 10:43:59
 */
public class UserLogProxy extends UserServiceImpl {

    private final BizService service = new UserServiceImpl();

    @Override
    public void doSomething() {
        System.out.println("静态代理执行前。。。打印日志 。。。。" );
        service.doSomething();
        System.out.println("静态代理执行后。。。 打印日志 。。。。" );
    }
}