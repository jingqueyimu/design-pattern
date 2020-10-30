package com.test.command.simple;

/**
 * 命令A1
 */
public class ConcreteCommandA1 implements Command{
    
    /**
     * 接收者A
     */
    ReceiverA receive;
    
    public ConcreteCommandA1(ReceiverA receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        // 接收者A执行动作1
        receive.action1();
    }
}
