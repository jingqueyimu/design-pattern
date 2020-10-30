package com.test.facade.movie;

/**
 * 影院灯光
 */
public class TheaterLights {
    
    /**
     * 打开灯光
     */
    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }
    
    /**
     * 调暗灯光
     */
    public void dim(int level) {
        System.out.println("Theater Ceiling Lights dimming to " + level + "%");
    }
}
