package topics.creational.factory.factoryMethod.factories;

import topics.creational.factory.factoryMethod.Computer;
import topics.creational.factory.factoryMethod.Desktop;

public class LaptopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop("8GB","512GB","i3");
    }
}
