package com.test.decorator.beverage;

/**
 * 调料抽象类（装饰者抽象类）
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
