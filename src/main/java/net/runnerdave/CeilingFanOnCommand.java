package net.runnerdave;

/**
 * Created by davidajimenez on 9/06/2016.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.on();
        System.out.println(fan.getLocation() + " turned on");
    }

    public void undo() {
        fan.off();
        System.out.println(fan.getLocation() + " turned off (via undo)");
    }
}
