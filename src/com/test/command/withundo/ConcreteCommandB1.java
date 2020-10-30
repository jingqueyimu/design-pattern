package com.test.command.withundo;

/**
 * 命令B1
 */
public class ConcreteCommandB1 implements Command{
    
    /**
     * 之前执行的动作
     */
    String prevAction;
    
    /**
     * 接收者B
     */
    ReceiverB receive;
    
    public ConcreteCommandB1(ReceiverB receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        // 先保存之前执行的动作
        this.prevAction = receive.getCurrAction();
        // 接收者执行动作1
        receive.action1();
    }

    @Override
    public void undo() {
        // 接收者撤销动作
        if ("action1".equals(prevAction)) {
            receive.action1();
        } else if ("action2".equals(prevAction)) {
            receive.action2();
        }
    }
}
