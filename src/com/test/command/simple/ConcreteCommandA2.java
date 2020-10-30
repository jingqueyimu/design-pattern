package com.test.command.simple;

/**
 * 命令A2
 */
public class ConcreteCommandA2 implements Command{
    
    /**
     * 接收者A
     */
    ReceiverA receive;
    
    public ConcreteCommandA2(ReceiverA receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        // 接收者A执行动作2
        receive.action2();
    }
}
