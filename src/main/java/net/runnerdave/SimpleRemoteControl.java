package net.runnerdave;

/**
 * Created by davidajimenez on 8/06/2016.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        System.out.println("Button pressed!");
        slot.execute();
    }
}
