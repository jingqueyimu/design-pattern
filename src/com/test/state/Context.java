package com.test.state;

/**
 * 持有状态的上下文类
 */
public class Context {
    
    private State state;
    
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    /**
     * 接收请求，并将请求委托给状态类
     */
    public void request() {
        state.handle();
    }
}
