package com.test.template;

/**
 * 具体子类B
 */
public class ConcreteClassB extends AbstractClass{

    @Override
    public void step1() {
        System.out.println("I'm step B1!");
    }

    @Override
    public void step2() {
        System.out.println("I'm step B2!");
    }

    @Override
    public void step3() {
        System.out.println("I'm step B3!");
    }
}
