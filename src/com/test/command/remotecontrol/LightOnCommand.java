package com.test.command.remotecontrol;

/**
 * 开灯命令
 */
public class LightOnCommand implements Command {
    
    Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
