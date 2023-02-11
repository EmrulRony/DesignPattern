package designpatterns.creational.factory.factoryMethod.factories;

import designpatterns.creational.factory.factoryMethod.Computer;
import designpatterns.creational.factory.factoryMethod.Desktop;

public class ServerFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop("50GB","512TB","i7 server");
    }
}
