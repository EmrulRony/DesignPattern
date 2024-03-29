package designpatterns.behavioral.commandPattern;

import designpatterns.behavioral.commandPattern.commands.LightOffCommand;
import designpatterns.behavioral.commandPattern.commands.LightOnCommand;
import designpatterns.behavioral.commandPattern.model.Light;

public class Main {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        RemoteControl remoteControl = new RemoteControl();

        LightOnCommand lightOnCommand = new LightOnCommand(bedroomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(bedroomLight);

        System.out.println("Light is turned "+(bedroomLight.getLightState()? "ON" : "OFF"));

        // Turning Light On
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        System.out.println("Light is turned "+(bedroomLight.getLightState() ? "ON" : "OFF"));

        //Turning Light Off
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();

        System.out.println("Light is turned "+(bedroomLight.getLightState()? "ON" : "OFF"));

    }
}
