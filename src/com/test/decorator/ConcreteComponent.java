package com.test.decorator;

/**
 * 具体组件（被装饰者）
 */
public class ConcreteComponent implements Component {

    @Override
    public void doSomething() {
        System.out.println("ConcreteComponent do something...");
    }
}
