package designpatterns.behavioral.commandPattern.commands;

import designpatterns.behavioral.commandPattern.Command;
import designpatterns.behavioral.commandPattern.model.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.setLightOff();
    }
}