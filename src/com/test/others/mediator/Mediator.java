package com.test.others.mediator;

/**
 * 中介者抽象类
 */
public abstract class Mediator {
    
    /**
     * 注册交互对象
     */
    public abstract void register(InteractiveObject obj);
    
    /**
     * 转发信息
     */
    public abstract void forward(InteractiveObject obj, String msg);
}
