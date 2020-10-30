package com.test.others.bridge;

/**
 * 具体实现化角色A
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void action() {
        System.out.println("ConcreteImplementorA action");
    }
}
