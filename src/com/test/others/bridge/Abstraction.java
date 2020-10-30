package com.test.others.bridge;

/**
 * 抽象化角色抽象类
 */
public abstract class Abstraction {

    /**
     * 实现化角色接口
     */
    Implementor implementor;
    
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    
    public abstract void action();
}
