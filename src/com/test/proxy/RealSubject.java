package com.test.proxy;

/**
 * 真正做事的真实主题（被代理类）
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject do something...");
    }
}
