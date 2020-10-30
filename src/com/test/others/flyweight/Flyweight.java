package com.test.others.flyweight;

/**
 * 抽象蝇量类
 */
public abstract class Flyweight {

    /**
     * 共享状态（所有实例共有的、一致的状态）
     */
    public String sharedState;

    /**
     * 非共享状态（不同实例间不共有、或者不一致的状态）
     */
    public final String unsharedState;
    
    public Flyweight(String unsharedState) {
        this.unsharedState = unsharedState;
    }
    
    public abstract void operate();
}
