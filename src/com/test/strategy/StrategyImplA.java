package com.test.strategy;

/**
 * 策略实现类A
 */
public class StrategyImplA implements Strategy {

    /**
     * A策略行为
     */
    @Override
    public void perform() {
        System.out.println("perform A...");
    }
}