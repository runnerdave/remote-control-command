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
        System.out.println("ceiling fan set to high");
    }

    public void setMedium() {
        this.speed = MEDIUM;
        System.out.println("ceiling fan set to medium");
    }

    public void setLow() {
        this.speed = LOW;
        System.out.println("ceiling fan set to low");
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
        System.out.println("ceiling fan on");
    }

    public void off() {
        this.on = false;
        this.speed = OFF;
        System.out.println("ceiling fan off");
    }

    public boolean isOn() {
        return on;
    }

    @Override
    public String toString() {
        return "CeilingFan{" +
                "location='" + location + '\'' +
                ", on=" + on +
                ", speed=" + speed +
                '}';
    }
}
