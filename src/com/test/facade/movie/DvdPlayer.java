package com.test.facade.movie;

/**
 * DVD播放器
 */
public class DvdPlayer {
    
    /**
     * 打开DVD播放器
     */
    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }
    
    /**
     * 关闭DVD播放器
     */
    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }
    
    /**
     * 播放DVD
     */
    public void play(String movie) {
        System.out.println("Top-O-Line DVD Player playing “" + movie + "”");
    }
    
    /**
     * 停止播放DVD
     */
    public void stop() {
        System.out.println("Top-O-Line DVD Player stop");
    }
    
    /**
     * 弹出DVD
     */
    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }
}
