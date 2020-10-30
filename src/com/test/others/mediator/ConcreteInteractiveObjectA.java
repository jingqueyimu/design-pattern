package com.test.others.mediator;

/**
 * 具体交互对象A
 */
public class ConcreteInteractiveObjectA extends InteractiveObject {

    public ConcreteInteractiveObjectA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        System.out.println("ConcreteInteractiveObjectA has sended message: " + msg);
        mediator.forward(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("ConcreteInteractiveObjectA has received message: " + msg);
    }
}
