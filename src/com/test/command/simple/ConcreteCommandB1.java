package com.test.command.simple;

/**
 * 命令B1
 */
public class ConcreteCommandB1 implements Command{
    
    /**
     * 接收者B
     */
    ReceiverB receive;
    
    public ConcreteCommandB1(ReceiverB receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        // 接收者B执行动作1
        receive.action1();
    }
}
