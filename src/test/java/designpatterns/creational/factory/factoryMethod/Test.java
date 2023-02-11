package designpatterns.creational.factory.factoryMethod;

import designpatterns.creational.factory.factoryMethod.factories.ComputerFactory;
import designpatterns.creational.factory.factoryMethod.factories.LaptopFactory;
import designpatterns.creational.factory.factoryMethod.factories.ServerFactory;

public class Test {
    @org.junit.Test
    public void testFactoryMethod(){
        ComputerFactory serverFactory = new ServerFactory();
        LaptopFactory laptopFactory = new LaptopFactory();

        System.out.println("server computer config  ---> ");
        serverFactory.printComputerConfig();
        System.out.println("laptop computer config  ---> ");
        laptopFactory.printComputerConfig();
    }
}
