package designpatterns.creational.factory.factoryObject;

import org.junit.Test;

public class FactoryPatternTest {
    @Test
    public void testFactory(){
        Computer laptop = ComputerFactory.getComputer(Type.LAPTOP);
        Computer server = ComputerFactory.getComputer(Type.SERVER);

        System.out.println("Laptop config --->");
        laptop.printConfig();
        System.out.println("Server config --->");
        server.printConfig();
    }
}
