package com.test.strategy.duck;

/**
 * 呱呱叫
 */
public class Quack implements QuackBehavior {

    @Override
    public void quark() {
        System.out.println("Quack");
    }
}
