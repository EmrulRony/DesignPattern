package designpatterns.creational.factory.factoryMethod.factories;

import designpatterns.creational.factory.factoryMethod.Computer;
import designpatterns.creational.factory.factoryMethod.Desktop;

public class LaptopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop("8GB","512GB","i3");
    }
}
