package com.test.others.responsibilitychain;

/**
 * 具体处理器A
 */
public class ConcreteHandlerA extends Handler {

    @Override
    protected void handleRequest(Request request) {
        if (request.getLevel() <= 1) {
            System.out.println("ConcreteHandlerA is handling the request, data: " + request.getData());
        } else {
            getNextHandler().handleRequest(request);
        }
    }
}
