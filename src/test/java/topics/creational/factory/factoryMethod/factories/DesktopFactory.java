package topics.creational.factory.factoryMethod.factories;

import topics.creational.factory.factoryMethod.Computer;
import topics.creational.factory.factoryMethod.Desktop;

public class DesktopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop("16GB","1TB","i5");
    }
}
