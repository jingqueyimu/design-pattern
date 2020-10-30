package com.test.command.remotecontrol;

/**
 * 电灯（接收者）
 */
public class Light {
    
    /**
     * 电灯位置
     */
    String location;
    
    public Light(String location) {
        this.location = location;
    }
    
    /**
     * 开灯
     */
    public void on() {
        System.out.println(location + " light is on");
    }
    
    /**
     * 关灯
     */
    public void off() {
        System.out.println(location + " light is off");
    }
}
