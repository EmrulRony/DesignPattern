package designpatterns.structural.decorator;

public class Decorator implements MenuItem {

    protected MenuItem beverage;


    public Decorator(MenuItem beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    @Override
    public String description() {
        return beverage.description();
    }
}
