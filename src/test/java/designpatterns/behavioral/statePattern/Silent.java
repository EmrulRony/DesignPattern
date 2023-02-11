package designpatterns.behavioral.statePattern;

public class Silent implements iNotification {
    @Override
    public void alert(NotificationContext context) {
        System.out.println("Silent....");
    }
}
