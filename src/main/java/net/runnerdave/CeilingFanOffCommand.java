package net.runnerdave;

/**
 * Created by davidajimenez on 9/06/2016.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.off();
        System.out.println(fan.getLocation() + " turned off");
    }

    public void undo() {
        fan.on();
        System.out.println(fan.getLocation() + " turned on (via undo command)");
    }
}
