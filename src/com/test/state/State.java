package com.test.state;

/**
 * 状态接口
 */
public interface State {
    
    /**
     * 根据状态进行处理的方法
     */
    public void handle();
}
