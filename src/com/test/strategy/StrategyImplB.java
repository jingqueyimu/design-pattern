package com.test.strategy;

/**
 * 策略实现类B
 */
public class StrategyImplB implements Strategy {

    /**
     * B策略行为
     */
    @Override
    public void perform() {
        System.out.println("perform B...");
    }
}