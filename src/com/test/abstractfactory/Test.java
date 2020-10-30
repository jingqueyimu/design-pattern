package com.test.abstractfactory;

public class Test {
    
    public static void main(String[] args) {
        // 工厂1
        AbstractFactory factory1 = new ConcreteFactory1();
        // 工厂2
        AbstractFactory factory2 = new ConcreteFactory2();
        
        // 工厂1创建产品
        ProductA productA = factory1.createProductA();
        System.out.println("工厂1创建产品A：" + productA.getName());
        ProductB productB = factory1.createProductB();
        System.out.println("工厂1创建产品B：" + productB.getName());
        // 工厂2创建产品
        productA = factory2.createProductA();
        System.out.println("工厂2创建产品A：" + productA.getName());
        productB = factory2.createProductB();
        System.out.println("工厂2创建产品B：" + productB.getName());
    }
}
