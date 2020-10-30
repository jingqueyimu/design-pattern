package com.test.strategy.duck;

/**
 * 鸭子抽象类
 */
public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck() {
    }
    
    /**
     * 外观
     */
    public abstract void display();

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    
    /**
     * 飞行行为
     */
    public void performFly() {
        flyBehavior.fly();
    }
    
    /**
     * 呱呱叫行为
     */
    public void performQuark() {
        quackBehavior.quark();
    }
}
