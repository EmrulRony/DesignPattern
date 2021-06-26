package topics.behavioral.observer;

public class YoutubeClient {
    public static void main(String[] args) {
        Subject mkbhd = new Channel("MKBHD");

        Observer john = new Subscriber("John");
        Observer doe = new Subscriber("Doe");
        Observer jane = new Subscriber("Jane");

        john.subscribeChannel(mkbhd);
        doe.subscribeChannel(mkbhd);
        jane.subscribeChannel(mkbhd);

        mkbhd.setSubscriber(john);
        mkbhd.setSubscriber(doe);
        mkbhd.setSubscriber(jane);

        mkbhd.unSubscribe(jane);

        mkbhd.notifySubscriber("iPhone 13 hands on review");
    }
}
