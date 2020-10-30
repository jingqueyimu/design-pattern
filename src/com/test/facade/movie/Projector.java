package com.test.facade.movie;

/**
 * 投影仪
 */
public class Projector {
    
    /**
     * 打开投影仪
     */
    public void on() {
        System.out.println("Top-O-Line Projector on");
    }
    
    /**
     * 关闭投影仪
     */
    public void off() {
        System.out.println("Top-O-Line Projector off");
    }
    
    /**
     * 设为宽屏模式
     */
    public void wideScreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
    }
}
