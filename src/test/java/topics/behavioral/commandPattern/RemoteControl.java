package topics.behavioral.commandPattern;

public class RemoteControl {
    Command command;

    public RemoteControl() {
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
