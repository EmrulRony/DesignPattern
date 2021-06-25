package topics.structural.decorator;

public class Mocha extends Decorator {

    public Mocha(MenuItem beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 5.0;
    }

    @Override
    public String description() {
        return beverage.description() + ", Mocha";
    }
}
