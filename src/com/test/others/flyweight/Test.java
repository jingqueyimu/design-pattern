package com.test.others.flyweight;

public class Test {

    public static void main(String[] args) {
        // 从工厂获取蝇量类实例，并执行操作
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("Unshared State A");
        flyweight1.operate();
        System.out.println();
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("Unshared State B");
        flyweight2.operate();
        System.out.println();
        Flyweight flyweight3 = FlyweightFactory.getFlyweight("Unshared State A");
        flyweight3.operate();
    }
}
