package com.test.decorator.beverage;

/**
 * 饮料抽象类（组件）
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";
    
    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * 价格
     */
    public abstract double cost();
}
