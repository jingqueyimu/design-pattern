package com.test.adapter;

public class Test {
    
    public static void main(String[] args) {
        // 被适配者
        Adaptee adaptee = new ConcreteAdaptee();
        // 适配器
        Adapter adapter = new Adapter(adaptee);
        adapter.request();
    }
}
