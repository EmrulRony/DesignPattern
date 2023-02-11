package designpatterns.creational.factory.factoryMethod.factories;

import designpatterns.creational.factory.factoryMethod.Computer;
import designpatterns.creational.factory.factoryMethod.Desktop;

public class DesktopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop("16GB","1TB","i5");
    }
}
