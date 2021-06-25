package topics.structural.decorator;

public class Espresso implements MenuItem {

    @Override
    public double cost() {
        return 18.5;
    }

    @Override
    public String description() {
        return "Espresso Roast";
    }
}
