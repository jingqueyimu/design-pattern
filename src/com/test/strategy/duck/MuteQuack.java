package com.test.strategy.duck;

/**
 * 不会叫
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quark() {
        System.out.println("<<Silence>>");
    }
}
