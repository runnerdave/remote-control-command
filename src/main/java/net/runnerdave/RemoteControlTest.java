package net.runnerdave;

/**
 * Created by davidajimenez on 8/06/2016.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen =
                new GarageDoorOpenCommand(garageDoor);


        System.out.println("light is on= [" + light.isOn() + "]");
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        System.out.println("light is on= [" + light.isOn() + "]");

        System.out.println("garage door is up = [" + garageDoor.isUp() + "]");
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
        System.out.println("garage door is up = [" + garageDoor.isUp() + "]");
    }
}
