package com.test.others.bridge;

/**
 * 具体抽象化角色A
 */
public class ConcreteAbstractionA extends Abstraction {

    public ConcreteAbstractionA(Implementor implementor) {
        super(implementor);
    }
    
    @Override
    public void action() {
        System.out.print("ConcreteAbstractionA action --> ");
        // 调用实现化角色的方法
        implementor.action();
    }
}
