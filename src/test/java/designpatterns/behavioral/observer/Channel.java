package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;

    public Channel(String name){
        this.name = name;
    }

    @Override
    public void setSubscriber(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifySubscriber(String videoTitle){
        for (Observer observer : observers){
            observer.update(videoTitle);
        }
    }

    @Override
    public void unSubscribe(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void upload(String title){
        notifySubscriber(title);
    }

}
