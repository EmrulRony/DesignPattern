package designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("abc.com");
        internet.connectTo("google.com");
    }
}
