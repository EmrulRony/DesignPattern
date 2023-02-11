package designpatterns.behavioral.mediatorPattern;

public class UserImpl extends User{

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " : Sending Message --> "+message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " : Message received <-- "+message);
    }
}
