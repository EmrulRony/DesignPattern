package designpatterns.behavioral.observer;

public interface Subject {
    void setSubscriber(Observer observer);

    void notifySubscriber(String videoTitle);

    void unSubscribe(Observer observer);

    void upload(String title);
}
