package com.test.others.bridge;

/**
 * 具体实现化角色B
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void action() {
        System.out.println("ConcreteImplementorB action");
    }
}
