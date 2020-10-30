package com.test.proxy.dynamic;

/**
 * 真正做事的真实主题
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject do something...");
    }
}
