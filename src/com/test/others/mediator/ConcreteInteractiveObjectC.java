package com.test.others.mediator;

/**
 * 具体交互对象C
 */
public class ConcreteInteractiveObjectC extends InteractiveObject {

    public ConcreteInteractiveObjectC(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        System.out.println("ConcreteInteractiveObjectC has sended message: " + msg);
        mediator.forward(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("ConcreteInteractiveObjectC has received message: " + msg);
    }
}
