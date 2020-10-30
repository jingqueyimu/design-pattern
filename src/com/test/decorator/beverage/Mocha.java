package com.test.decorator.beverage;

/**
 * 摩卡（装饰者）
 */
public class Mocha extends CondimentDecorator {
    
    Beverage beverage;
    
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        // 加上摩卡的价格
        return beverage.cost() + 0.20;
    }
}
