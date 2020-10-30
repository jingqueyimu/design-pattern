package com.test.adapter.turkey;

/**
 * 火鸡适配器
 */
public class TurkeyAdapter implements Duck {
    
    /**
     * 火鸡
     */
    Turkey turkey;
    
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quark() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 火鸡飞行距离比鸭子短，因此需要调用5次火鸡的fly()方法。
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
