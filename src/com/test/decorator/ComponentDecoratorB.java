package com.test.decorator;

/**
 * 装饰者B
 */
public class ComponentDecoratorB extends ComponentDecorator {

    public ComponentDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        // 装饰者添加自己的业务代码
        
        component.doSomething();
        
        // 装饰者添加自己的业务代码
        System.out.println("ComponentDecoratorB do something...");
    }
}
