package com.test.command.withundo;

/**
 * 接收者A
 */
public class ReceiverA {
    
    /**
     * 当前执行的动作
     */
    String currAction;

    /**
     * 动作1
     */
    public void action1() {
        this.currAction = "action1";
        System.out.println("ReceiverA do action1");
    }
    
    /**
     * 动作2
     */
    public void action2() {
        this.currAction = "action2";
        System.out.println("ReceiverA do action2");
    }
    
    public String getCurrAction(){
        return this.currAction;
    }
}
