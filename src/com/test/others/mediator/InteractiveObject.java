package com.test.others.mediator;

/**
 * 交互对象抽象类
 */
public abstract class InteractiveObject {

    protected Mediator mediator;
    
    public InteractiveObject(Mediator mediator) {
        this.mediator = mediator;
    }
    
    /**
     * 发送信息
     */
    public abstract void send(String msg);
    
    /**
     * 接收信息
     */
    public abstract void receive(String msg);
}
