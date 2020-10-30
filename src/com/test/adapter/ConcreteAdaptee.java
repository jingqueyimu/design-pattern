package com.test.adapter;

/**
 * 具体的被适配者
 */
public class ConcreteAdaptee implements Adaptee {
    
    @Override
    public void specificRequest() {
        System.out.println("ConcreteAdaptee is doing something...");
    }
}
