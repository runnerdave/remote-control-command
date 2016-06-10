package net.runnerdave;

/**
 * Created by davidajimenez on 9/06/2016.
 */
public class Stereo {

    private boolean isOn;
    private int volume;

    public String getLocation() {
        return location;
    }

    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    void on() {
        this.isOn = true;
    }

    void off() {
        isOn = false;
    }

    void setCD() {
        System.out.println("cd set");
    }

    void setDvd() {

    }

    void setRadio() {

    }

    void setVolume(int volume) {
        this.volume = volume;
    }
}
