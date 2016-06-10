package net.runnerdave;

/**
 * Created by davidajimenez on 8/06/2016.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
        System.out.println(light.getLocation() + " turned off");
    }

    public void undo() {
        light.on();
        System.out.println(light.getLocation() + " turned on (via undo)");
    }
}
