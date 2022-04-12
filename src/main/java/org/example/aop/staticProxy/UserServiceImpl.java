package org.example.aop.staticProxy;

/**
 * 实现用户服务接口
 *
 * @author ninggelin
 * @date 2022-04-12 10:44:12
 */
public class UserServiceImpl implements BizService {
    @Override
    public void doSomething() {
        System.out.println("执行用户相关业务逻辑");
    }
}