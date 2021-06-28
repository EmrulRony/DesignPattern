package topics.behavioral.mediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User john = new UserImpl(mediator, "John");
        User doe = new UserImpl(mediator, "Doe");
        User jack = new UserImpl(mediator, "Jack");
        User kallis = new UserImpl(mediator, "Kallis");

        mediator.addUser(john);
        mediator.addUser(doe);
        mediator.addUser(jack);
        mediator.addUser(kallis);

        john.sendMessage("Hello world!");
    }
}
