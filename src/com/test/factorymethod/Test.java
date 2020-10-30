package com.test.factorymethod;

public class Test {
    
    public static void main(String[] args) {
        // 创建者1
        Creator creator1 = new ConcreteCreator1();
        // 创建者2
        Creator creator2 = new ConcreteCreator2();
        
        // 通过工厂方法创建产品
        Product product = creator1.createProduct("A");
        System.out.println("创建者1创建产品A：" + product.getName());
        product = creator2.createProduct("A");
        System.out.println("创建者2创建产品A：" + product.getName());
    }
}
