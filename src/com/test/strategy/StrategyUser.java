package com.test.strategy;

/**
 * 策略使用者
 */
public class StrategyUser {
    
    /**
     * 声明接口类型的策略变量
     */
    private Strategy strategy;
    
    /**
     * 通过构造实例化策略
     */
    public StrategyUser(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略使用者的行为
     */
    public void doBehavior() {
        // do something...
        
        // 使用策略
        strategy.perform();
        
        // do something...
    }
}