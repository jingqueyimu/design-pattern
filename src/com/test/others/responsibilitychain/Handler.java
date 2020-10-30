package com.test.others.responsibilitychain;

/**
 * 处理器抽象类
 */
public abstract class Handler {

    /**
     * 下一个处理器
     */
    protected Handler nextHandler;
    
    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求
     */
    protected abstract void handleRequest(Request request);
}
