package designpatterns.creational.factory.factoryMethod.factories;

import designpatterns.creational.factory.factoryMethod.Computer;

public abstract class ComputerFactory {
    public void printComputerConfig(){
        Computer computer = createComputer();
        computer.printConfig();
    }

    public abstract Computer createComputer();
}
