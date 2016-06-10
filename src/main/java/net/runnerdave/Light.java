package net.runnerdave;

/**
 * Created by davidajimenez on 8/06/2016.
 */
public class Light {
    private boolean on;

    public String getLocation() {
        return location;
    }

    private String location;

    public Light() {
    }

    public Light(String location){
        this.location = location;
    }

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }
}
