package designpatterns.behavioral.commandPattern.commands;

import designpatterns.behavioral.commandPattern.Command;
import designpatterns.behavioral.commandPattern.model.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.setLightOne();
    }
}
