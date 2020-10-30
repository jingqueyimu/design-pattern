package com.test.command.withundo;

/**
 * 命令A2
 */
public class ConcreteCommandA2 implements Command{
    
    /**
     * 之前执行的动作
     */
    String prevAction;
    
    /**
     * 接收者A
     */
    ReceiverA receive;
    
    public ConcreteCommandA2(ReceiverA receive) {
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
