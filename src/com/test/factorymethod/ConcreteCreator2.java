package com.test.factorymethod;

/**
 * 创建者2
 */
public class ConcreteCreator2 extends Creator {

    @Override
    protected Product createProduct(String productType) {
        // 由具体的创建者（子类）决定创建哪个类的对象
        if ("A".equals(productType)) {
            return new ConcreteProductA2();
        } else if ("B".equals(productType)) {
            return new ConcreteProductB2();
        }
        return null;
    }
}
