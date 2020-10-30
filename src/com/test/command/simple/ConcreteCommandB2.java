package com.test.command.simple;

/**
 * 命令B2
 */
public class ConcreteCommandB2 implements Command{
    
    /**
     * 接收者B
     */
    ReceiverB receive;
    
    public ConcreteCommandB2(ReceiverB receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        // 接收者B执行动作2
        receive.action2();
    }
}
