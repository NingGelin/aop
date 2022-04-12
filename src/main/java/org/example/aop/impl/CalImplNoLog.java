package org.example.aop.impl;

import org.example.aop.Cal;
import org.springframework.stereotype.Component;

/**
 * <p>不打印日志的实现</p>
 *
 * @author : ninggelin
 * @date : 2022-04-12 09:29
 **/
@Component
public final class CalImplNoLog implements Cal {
    @Override
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    @Override
    public int mul(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    @Override
    public int div(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
