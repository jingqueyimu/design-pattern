package com.test.strategy;

public class Test {
    
    public static void main(String[] args) {
        // 使用策略A
        StrategyUser userA = new StrategyUser(new StrategyImplA());
        userA.doBehavior();
        // 使用策略B
        StrategyUser userB = new StrategyUser(new StrategyImplB());
        userB.doBehavior();
    }
}
