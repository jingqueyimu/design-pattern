package com.test.facade;

/**
 * 外观类
 */
public class Facade {
    
    ComponentA componentA;
    ComponentB componentB;
    ComponentC componentC;
    
    public Facade(ComponentA componentA,
            ComponentB componentB,
            ComponentC componentC) {
        this.componentA = componentA;
        this.componentB = componentB;
        this.componentC = componentC;
    }

    /**
     * 通过外观类，请求子系统组件
     */
    public void request() {
        componentA.action();
        componentB.action();
        componentC.action();
    }
}
