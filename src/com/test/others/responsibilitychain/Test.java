package com.test.others.responsibilitychain;

public class Test {

    public static void main(String[] args) {
        // 创建责任链（处理器链）
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);
        // 使用责任链处理请求
        handlerA.handleRequest(new Request(1, "请求1"));
        handlerA.handleRequest(new Request(2, "请求2"));
        handlerA.handleRequest(new Request(3, "请求3"));
        handlerA.handleRequest(new Request(4, "请求4"));
    }
}
