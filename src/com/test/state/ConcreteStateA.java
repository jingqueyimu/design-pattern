package com.test.state;

/**
 * 具体状态A
 */
public class ConcreteStateA implements State {
    
    Context context;
    
    public ConcreteStateA() {
        context = new Context();
    }

    @Override
    public void handle() {
        // 实现该状态下相应的行为
        System.out.println("Context is in A state, and start to do something...");
        context.setState(this);
    }
}
