package net.runnerdave;

/**
 * Created by davidajimenez on 8/06/2016.
 */
public class GarageDoor {

    public GarageDoor(String location) {

    }

    public GarageDoor() {

    }

    public boolean isUp() {
        return up;
    }

    private boolean up;

    void up() {
        this.up = true;
    }

    void down() {
        this.up = false;
    }

    void stop() {

    }

    void lightOn() {

    }

    void lightOff() {

    }
}
