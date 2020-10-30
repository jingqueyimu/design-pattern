package com.test.decorator;

/**
 * 装饰者A
 */
public class ComponentDecoratorA extends ComponentDecorator {

    public ComponentDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        // 装饰者添加自己的业务代码
        
        component.doSomething();
        
        // 装饰者添加自己的业务代码
        System.out.println("ComponentDecoratorA do something...");
    }
}
