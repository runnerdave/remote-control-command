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
        System.out.println("stereo on");
    }

    void off() {
        isOn = false;
        System.out.println("stereo off");
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

    @Override
    public String toString() {
        return "Stereo{" +
                "isOn=" + isOn +
                ", volume=" + volume +
                ", location='" + location + '\'' +
                '}';
    }
}
