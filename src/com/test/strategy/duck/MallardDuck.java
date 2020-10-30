package com.test.strategy.duck;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {
    
    public MallardDuck() {
        // 指定具体的飞行行为
        flyBehavior = new FlyWithWings();
        // 指定具体的呱呱叫行为
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
