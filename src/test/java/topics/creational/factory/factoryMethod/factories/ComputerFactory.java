package topics.creational.factory.factoryMethod.factories;

import topics.creational.factory.factoryMethod.Computer;

public abstract class ComputerFactory {
    public void printComputerConfig(){
        Computer computer = createComputer();
        computer.printConfig();
    }

    public abstract Computer createComputer();
}
