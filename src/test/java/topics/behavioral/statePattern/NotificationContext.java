package topics.behavioral.statePattern;

public class NotificationContext {
    private iNotification currentState;

    public NotificationContext(){
        currentState = new Vibration();
    }

    public void setState(iNotification state){
        currentState = state;
    }

    public void alert(){
        currentState.alert(this);
    }
}
