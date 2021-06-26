package topics.behavioral.commandPattern.model;

public class Light {
    private boolean lightSwitch;

    public void setLightOne(){
        this.lightSwitch = Boolean.TRUE;
    }

    public void setLightOff(){
        this.lightSwitch = Boolean.FALSE;
    }

    public boolean getLightState(){
        return this.lightSwitch;
    }
}
