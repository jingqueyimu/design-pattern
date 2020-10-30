package com.test.strategy.duck;

/**
 * 吱吱叫
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quark() {
        System.out.println("Squeak");
    }
}
