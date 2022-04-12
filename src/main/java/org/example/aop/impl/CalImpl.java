package org.example.aop.impl;

import org.example.aop.Cal;

/**
 * <p>传统方法实现Cal接口</p>
 *
 * @author : ninggelin
 * @date : 2022-04-12 09:04
 **/
public class CalImpl implements Cal {

    @Override
    public int add(int num1, int num2) {
        System.out.printf("add方法请求参数 num1: %d, num2: %d\n", num1, num2);
        int result = num1 + num2;
        System.out.printf("add方法返回结果 %d\n\n", result);
        return result;
    }

    @Override
    public int sub(int num1, int num2) {
        System.out.printf("sub方法请求参数 num1: %d, num2: %d\n", num1, num2);
        int result = num1 - num2;
        System.out.printf("sub方法返回结果 %d\n\n", result);
        return result;
    }

    @Override
    public int mul(int num1, int num2) {
        System.out.printf("mul方法请求参数 num1: %d, num2: %d\n", num1, num2);
        int result = num1 * num2;
        System.out.printf("mul方法返回结果 %d\n\n", result);
        return result;
    }

    @Override
    public int div(int num1, int num2) {
        System.out.printf("div方法请求参数 num1: %d, num2: %d\n", num1, num2);
        int result = num1 / num2;
        System.out.printf("div方法返回结果 %d\n\n", result);
        return result;
    }
}
