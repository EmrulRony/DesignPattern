package topics.behavioral.mediatorPattern;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    private User(){}

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
