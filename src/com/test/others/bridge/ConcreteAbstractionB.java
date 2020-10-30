package com.test.others.bridge;

/**
 * 具体抽象化角色B
 */
public class ConcreteAbstractionB extends Abstraction {

    public ConcreteAbstractionB(Implementor implementor) {
        super(implementor);
    }
    
    @Override
    public void action() {
        System.out.print("ConcreteAbstractionB action --> ");
        // 调用实现化角色的方法
        implementor.action();
    }
}
