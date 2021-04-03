package topics.creational.factory.factoryMethod.factories;

import topics.creational.factory.factoryMethod.Computer;
import topics.creational.factory.factoryMethod.Desktop;

public class ServerFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop("50GB","512TB","i7 server");
    }
}
