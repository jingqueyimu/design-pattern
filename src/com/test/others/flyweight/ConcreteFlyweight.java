package com.test.others.flyweight;

/**
 * 具体蝇量类
 */
public class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String unsharedState) {
        super(unsharedState);
        sharedState = "Shared State";
    }

    @Override
    public void operate() {
        System.out.println("ConcreteFlyweight is operating. [sharedState: " + sharedState + ", unsharedState: " + unsharedState + "]");
    }
}
