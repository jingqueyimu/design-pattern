package com.test.abstractfactory;

/**
 * 抽象工厂接口
 */
public interface AbstractFactory {
    
    /**
     * 创建产品A
     */
    public ProductA createProductA();
    
    /**
     * 创建产品B
     */
    public ProductB createProductB();
}
