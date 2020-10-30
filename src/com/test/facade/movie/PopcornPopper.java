package com.test.facade.movie;

/**
 * 爆米花机
 */
public class PopcornPopper {
    
    /**
     * 打开爆米花机
     */
    public void on() {
        System.out.println("Popcorn Popper on");
    }
    
    /**
     * 关闭爆米花机
     */
    public void off() {
        System.out.println("Popcorn Popper off");
    }
    
    /**
     * 开始爆米花
     */
    public void pop() {
        System.out.println("Popcorn Popper popping popcorn!");
    }
}
