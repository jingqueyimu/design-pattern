package com.test.others.responsibilitychain;

/**
 * 具体处理器C
 */
public class ConcreteHandlerC extends Handler {

    @Override
    protected void handleRequest(Request request) {
        if (request.getLevel() <= 3) {
            System.out.println("ConcreteHandlerC is handling the request, data: " + request.getData());
        } else {
            System.out.println("No handler can handle the request...");
        }
    }
}
