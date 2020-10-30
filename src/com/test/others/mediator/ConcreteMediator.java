package com.test.others.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {

    /**
     * 交互对象集合
     */
    private List<InteractiveObject> interactiveObjs = new ArrayList<>();

    @Override
    public void register(InteractiveObject obj) {
        interactiveObjs.add(obj);
    }

    @Override
    public void forward(InteractiveObject obj, String msg) {
        for (InteractiveObject interactiveObj : interactiveObjs) {
            if (!interactiveObj.equals(obj)) {
                interactiveObj.receive(msg);
            }
        }
    }
}
