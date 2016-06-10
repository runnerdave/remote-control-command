package net.runnerdave;

/**
 * Created by davidajimenez on 9/06/2016.
 */
public class GarageDoorDownCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
        System.out.println(garageDoor.toString() + " closed");
    }

    public void undo() {

    }
}
