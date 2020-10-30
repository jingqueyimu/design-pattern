package com.test.command.withundo;

/**
 * 命令B2
 */
public class ConcreteCommandB2 implements Command{
    
    /**
     * 之前执行的动作
     */
    String prevAction;
    
    /**
     * 接收者B
     */
    ReceiverB receive;
    
    public ConcreteCommandB2(ReceiverB receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        // 先保存之前执行的动作
        this.prevAction = receive.getCurrAction();
        // 接收者执行动作2
        receive.action2();
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
