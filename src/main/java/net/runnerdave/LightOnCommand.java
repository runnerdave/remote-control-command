package net.runnerdave;

/**
 * Created by davidajimenez on 8/06/2016.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
        System.out.println(light.getLocation() + " turned on");
    }

    public void undo() {
        light.off();
        System.out.println(light.getLocation() + " turned off (via undo)");
    }
}
