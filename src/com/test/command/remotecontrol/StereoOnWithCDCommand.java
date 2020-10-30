package com.test.command.remotecontrol;

/**
 * 打开音响播放CD命令
 */
public class StereoOnWithCDCommand implements Command {
    
    Stereo stereo;
    
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
