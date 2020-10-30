package com.test.decorator.beverage;

/**
 * 豆浆（装饰者）
 */
public class Soy extends CondimentDecorator {
    
    Beverage beverage;
    
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        // 加上豆浆的价格
        return beverage.cost() + 0.15;
    }
}
