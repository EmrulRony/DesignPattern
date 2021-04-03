package topics.creational.factory.factoryObject;

public class ComputerFactory {
    public static Computer getComputer(Type type){
        if (type == Type.DESKTOP){
            return new Desktop("8GB","1TB","i5");
        } else if(type == Type.LAPTOP){
            return new Laptop("8GB","512GB","i3");
        } else if(type == Type.SERVER){
            return new Server("1024GB", "512TB", "i7");
        } else {
            throw new IllegalArgumentException("Computer type not supported");
        }
    }
}
