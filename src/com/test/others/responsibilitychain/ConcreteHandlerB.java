package com.test.others.responsibilitychain;

/**
 * 具体处理器B
 */
public class ConcreteHandlerB extends Handler {

    @Override
    protected void handleRequest(Request request) {
        if (request.getLevel() <= 2) {
            System.out.println("ConcreteHandlerB is handling the request, data: " + request.getData());
        } else {
            getNextHandler().handleRequest(request);
        }
    }
}
