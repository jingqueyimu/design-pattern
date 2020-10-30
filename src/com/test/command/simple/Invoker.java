package com.test.command.simple;

/**
 * 调用者
 */
public class Invoker {

    /**
     * 命令对象
     */
    Command command;
    
    /**
     * 设置命令
     */
    public void setCommand(Command command) {
        this.command = command;
    }
    
    /**
     * 调用动作
     */
    public void invoke() {
        command.execute();
    }
}
