package com.test.others.mediator;

public class Test {

    public static void main(String[] args) {
        // 中介者
        Mediator mediator = new ConcreteMediator();
        // 交互对象
        InteractiveObject objA = new ConcreteInteractiveObjectA(mediator);
        InteractiveObject objB = new ConcreteInteractiveObjectB(mediator);
        InteractiveObject objC = new ConcreteInteractiveObjectC(mediator);
        // 注册交互对象到中介者
        mediator.register(objA);
        mediator.register(objB);
        mediator.register(objC);
        // 发送信息
        objA.send("hello");
    }
}
