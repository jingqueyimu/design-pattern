package com.test.adapter.turkey;

public class Test {
    
    public static void main(String[] args) {
        // 火鸡（被适配者）
        Turkey turkey = new WildTurkey();
        // 火鸡适配器
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quark();
        turkeyAdapter.fly();
    }
}
