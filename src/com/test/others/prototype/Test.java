package com.test.others.prototype;

public class Test {

    public static void main(String[] args) {
        Prototype prototype1 = new Prototype("A");
        System.out.println(prototype1);
        // 复制现有实例来创建新的实例
        Prototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
    }
}
