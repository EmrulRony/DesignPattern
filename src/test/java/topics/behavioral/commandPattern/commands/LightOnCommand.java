package topics.behavioral.commandPattern.commands;

import topics.behavioral.commandPattern.Command;
import topics.behavioral.commandPattern.model.Light;

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
