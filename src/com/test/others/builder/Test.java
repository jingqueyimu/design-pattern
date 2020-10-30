package com.test.others.builder;

public class Test {

    public static void main(String[] args) {
        // 生成器
        Builder builder = new ConcreteBuilder();
        // 生成产品
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        // 获取产品
        Product product = builder.getProduct();
        System.out.println(product);
    }
}
