package topics.behavioral.statePattern;

public class Vibration implements iNotification {
    @Override
    public void alert(NotificationContext context) {
        System.out.println("Vibration alert...");
    }
}
