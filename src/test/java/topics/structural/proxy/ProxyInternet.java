package topics.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet internet;
    private static List<String> restrictedURLs = new ArrayList<>();

    static {
        restrictedURLs.add("abc.com");
        restrictedURLs.add("qwerty.com");
        restrictedURLs.add("xyz.com");
    }

    public ProxyInternet(){
        internet = new RealInternet();
    }
    @Override
    public void connectTo(String url) {
        if (restrictedURLs.contains(url)){
            System.out.println("Access denied for this site "+url);
        } else {
            internet.connectTo(url);
        }
    }
}
