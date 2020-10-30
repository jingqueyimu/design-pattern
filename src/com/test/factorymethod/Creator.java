package com.test.factorymethod;

/**
 * 创建者抽象类
 */
public abstract class Creator {

    /**
     * 创建产品（工厂方法）
     */
    protected abstract Product createProduct(String productType);
}
