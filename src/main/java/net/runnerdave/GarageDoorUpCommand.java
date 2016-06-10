package net.runnerdave;

/**
 * Created by davidajimenez on 9/06/2016.
 */
public class GarageDoorUpCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
        System.out.println(garageDoor.toString() + " opened");
    }

    public void undo() {

    }
}
