package topics.behavioral.observer;


public class Subscriber implements Observer {
    private String name;
    private Subject channel;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void subscribeChannel(Subject channel){
        this.channel = channel;
    }

    @Override
    public void update(String title){
        System.out.println("Hey "+ name + " video uploaded "+ "Title: "+ title);
    }

}
