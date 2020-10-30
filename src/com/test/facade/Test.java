package com.test.facade;

public class Test {
    
    public static void main(String[] args) {
        // 子系统组件
        ComponentA componentA = new ComponentA();
        ComponentB componentB = new ComponentB();
        ComponentC componentC = new ComponentC();
        // 外观类
        Facade facade = new Facade(componentA, componentB, componentC);
        facade.request();
    }
}
