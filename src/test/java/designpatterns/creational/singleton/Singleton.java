package designpatterns.creational.singleton;

public class Singleton {
    private static Singleton instance;
    private String message = "I love java";

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
