package net.runnerdave;

/**
 * Created by davidajimenez on 10/06/2016.
 */
public class RemoteLoaderWithUndo {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Stereo stereo = new Stereo("Stereo");
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        //commands for macrocommand
        Command[] chillaxSummerNightOn = {livingRoomLightOn, ceilingFanMediumCommand, stereoOnWithCDCommand};
        Command[] chillaxSummerNightOff = {livingRoomLightOff, ceilingFanOffCommand, stereoOffCommand};
        MacroCommand chillaxMacroOn = new MacroCommand(chillaxSummerNightOn);
        MacroCommand chillaxMacroOff = new MacroCommand(chillaxSummerNightOff);

        //set the commands in the remote
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, chillaxMacroOn, chillaxMacroOff);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);


        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        System.out.println("chillout started");
        remoteControl.onButtonWasPushed(1);

        System.out.println("chillout finished");
        remoteControl.offButtonWasPushed(1);
    }
}