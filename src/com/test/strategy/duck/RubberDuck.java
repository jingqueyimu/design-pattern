package com.test.strategy.duck;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck {
    
    public RubberDuck() {
        // 指定具体的飞行行为
        flyBehavior = new FlyNoWay();
        // 指定具体的呱呱叫行为
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
