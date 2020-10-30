package com.test.decorator;

/**
 * 组件装饰者抽象类
 */
public abstract class ComponentDecorator implements Component {
    
    protected Component component;
    
    public ComponentDecorator(Component component) {
        // 通过构造传入组件（被装饰者）
        this.component = component;
    }

    @Override
    public void doSomething() {
        // 委托给组件（被装饰者）
        component.doSomething();
    }
}
