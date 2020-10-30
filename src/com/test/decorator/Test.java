package com.test.decorator;

public class Test {
    
    public static void main(String[] args) {
        // 具体组件（被装饰者）
        Component component = new ConcreteComponent();
        // 用装饰者A装饰组件
        ComponentDecorator componentDecoratorA = new ComponentDecoratorA(component);
        // 用装饰者B装饰组件
        ComponentDecorator componentDecoratorB = new ComponentDecoratorB(component);
        
        component.doSomething();
        componentDecoratorA.doSomething();
        componentDecoratorB.doSomething();
    }
}
