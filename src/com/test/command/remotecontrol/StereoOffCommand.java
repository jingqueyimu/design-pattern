package com.test.command.remotecontrol;

/**
 * 关闭音响命令
 */
public class StereoOffCommand implements Command {
    
    Stereo stereo;
    
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
