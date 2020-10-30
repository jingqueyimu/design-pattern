package com.test.strategy.duck;

/**
 * 诱饵鸭
 */
public class DecoyDuck extends Duck {
    
    public DecoyDuck() {
        // 指定具体的飞行行为
        flyBehavior = new FlyNoWay();
        // 指定具体的呱呱叫行为
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
