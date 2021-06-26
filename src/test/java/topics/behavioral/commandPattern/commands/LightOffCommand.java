package topics.behavioral.commandPattern.commands;

import topics.behavioral.commandPattern.Command;
import topics.behavioral.commandPattern.model.Light;

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