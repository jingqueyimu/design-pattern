package com.test.strategy.duck;

/**
 * 红头鸭
 */
public class RedHeadDuck extends Duck {
    
    public RedHeadDuck() {
        // 指定具体的飞行行为
        flyBehavior = new FlyWithWings();
        // 指定具体的呱呱叫行为
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
