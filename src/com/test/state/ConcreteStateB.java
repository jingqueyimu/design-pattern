package com.test.state;

/**
 * 具体状态B
 */
public class ConcreteStateB implements State {
    
    Context context;
    
    public ConcreteStateB() {
        context = new Context();
    }

    @Override
    public void handle() {
        // 实现该状态下相应的行为
        System.out.println("Context is in B state, and start to do something...");
        context.setState(this);
    }
}
