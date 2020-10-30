package com.test.state.gumballmachine;

/**
 * 状态接口
 */
public interface State {
    
    /**
     * 投入25分钱
     */
    public void insertQuarter();
    
    /**
     * 退回25分钱
     */
    public void ejectQuarter();
    
    /**
     * 转动曲柄
     */
    public void turnCrank();
    
    /**
     * 发放糖果
     */
    public void dispense();
}
