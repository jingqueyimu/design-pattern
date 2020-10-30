package com.test.strategy.duck;

/**
 * 用翅膀飞行
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
