package com.test.factorymethod;

/**
 * 创建者1
 */
public class ConcreteCreator1 extends Creator {

    @Override
    protected Product createProduct(String productType) {
        // 由具体的创建者（子类）决定创建哪个类的对象
        if ("A".equals(productType)) {
            return new ConcreteProductA1();
        } else if ("B".equals(productType)) {
            return new ConcreteProductB1();
        }
        return null;
    }
}
