package com.test.others.mediator;

/**
 * 具体交互对象B
 */
public class ConcreteInteractiveObjectB extends InteractiveObject {

    public ConcreteInteractiveObjectB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        System.out.println("ConcreteInteractiveObjectB has sended message: " + msg);
        mediator.forward(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("ConcreteInteractiveObjectB has received message: " + msg);
    }
}
