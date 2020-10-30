package com.test.factorymethod.pizza;

/**
 * 披萨店抽象类
 */
public abstract class PizzaStore {
    
    /**
     * 订购披萨
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    /**
     * 创建披萨（工厂方法）
     */
    protected abstract Pizza createPizza(String type);
}
