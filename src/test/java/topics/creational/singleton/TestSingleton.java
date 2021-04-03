package topics.creational.singleton;

import org.junit.Test;

public class TestSingleton {

    @Test
    public void testSingleton(){
        Singleton singletonObj = Singleton.getInstance();
        Singleton singletonObj1 = Singleton.getInstance();
        // Before changing obj
        System.out.println(singletonObj.getMessage());
        System.out.println(singletonObj1.getMessage());

        Singleton singletonObj2 = Singleton.getInstance();
        Singleton singletonObj3 = Singleton.getInstance();
        singletonObj2.setMessage("I love Python");

        // After changing obj
        System.out.println(singletonObj2.getMessage());
        System.out.println(singletonObj3.getMessage());
    }
}
