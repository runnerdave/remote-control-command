package net.runnerdave;

/**
 * Created by davidajimenez on 8/06/2016.
 */
public interface Command {
    public void execute();
    public void undo();
}
