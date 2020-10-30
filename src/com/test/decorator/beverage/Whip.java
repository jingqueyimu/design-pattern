package com.test.decorator.beverage;

/**
 * 奶泡（装饰者）
 */
public class Whip extends CondimentDecorator {
    
    Beverage beverage;
    
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        // 加上奶泡的价格
        return beverage.cost() + 0.10;
    }
}
