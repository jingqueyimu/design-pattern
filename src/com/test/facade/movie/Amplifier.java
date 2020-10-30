package com.test.facade.movie;

/**
 * 功放
 */
public class Amplifier {
    
    /**
     * 打开功放
     */
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }
    
    /**
     * 关闭功放
     */
    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }
    
    /**
     * 设置DVD
     */
    public void setDvd(DvdPlayer dvd) {
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }
    
    /**
     * 设置为环绕立体声
     */
    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }
    
    /**
     * 调节音量
     */
    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier setting volume to " + volume);
    }
}
