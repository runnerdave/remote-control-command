package net.runnerdave;

/**
 * Created by davidajimenez on 10/06/2016.
 */
public class CeilingFanLowCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.setLow();
    }

    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.setHigh();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.setMedium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.setLow();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off(); }
    }
}
