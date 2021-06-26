package topics.behavioral.observer;

public interface Observer {
    void subscribeChannel(Subject channel);

    void update(String title);
}
