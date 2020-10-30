package com.test.command.remotecontrol;

/**
 * 关灯命令
 */
public class LightOffCommand implements Command {
    
    Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
