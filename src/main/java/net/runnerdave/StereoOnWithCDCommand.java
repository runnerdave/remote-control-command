package net.runnerdave;

/**
 * Created by davidajimenez on 9/06/2016.
 */
public class StereoOnWithCDCommand implements Command{
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) { this.stereo = stereo;
    }
    public void execute() { stereo.on();
        stereo.setCD();
        stereo.setVolume(11); }

    public void undo() {

    }
}
