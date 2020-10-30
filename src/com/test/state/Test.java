package com.test.state;

public class Test {

    public static void main(String[] args) {
        // 上下文
        Context context = new Context();
        // 状态
        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();
        // 通过状态改变行为
        context.setState(stateA);
        context.request();
        context.setState(stateB);
        context.request();
    }
}
