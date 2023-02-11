package designpatterns.structural.decorator;

public class Milk extends Decorator {

    public Milk(MenuItem beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 7.4;
    }

    @Override
    public String description() {
        return beverage.description() + ", Milk";
    }
}
