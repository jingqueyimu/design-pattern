package com.test.template;

/**
 * 具体子类A
 */
public class ConcreteClassA extends AbstractClass{

    @Override
    public void step1() {
        System.out.println("I'm step A1!");
    }

    @Override
    public void step2() {
        System.out.println("I'm step A2!");
    }

    @Override
    public void step3() {
        System.out.println("I'm step A3!");
    }
    
    @Override
    public void hook() {
        System.out.println("I'm hook step A!");
    }
}
