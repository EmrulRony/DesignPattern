package designpatterns.behavioral.statePattern;

public class Main {
    public static void main(String[] args) {
        NotificationContext stateContext = new NotificationContext();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
    }
}
