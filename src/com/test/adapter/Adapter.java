package com.test.adapter;

/**
 * 适配器
 */
public class Adapter implements Target {
    
    /**
     * 被适配者
     */
    Adaptee adaptee;
    
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // 调用被适配者方法
        adaptee.specificRequest();
    }
}
