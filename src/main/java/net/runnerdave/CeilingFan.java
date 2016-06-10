package net.runnerdave;

/**
 * Created by davidajimenez on 9/06/2016.
 */
public class CeilingFan {

    private String location;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private boolean on;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void setHigh() {
        this.speed = HIGH;
        printState();
    }

    public void setMedium() {
        this.speed = MEDIUM;
        printState();
    }

    public void setLow() {
        this.speed = LOW;
        printState();
    }

    public String getLocation() {
        return location;
    }

    public int getSpeed() {
        return speed;
    }


    public void on() {
        this.on = true;
        this.setLow();
        printState();
    }

    public void off() {
        this.on = false;
        this.speed = OFF;
        printState();
    }

    public boolean isOn() {
        return on;
    }

    private void printState () {
        System.out.println(location + " speed set to " + speed);
    }
}
