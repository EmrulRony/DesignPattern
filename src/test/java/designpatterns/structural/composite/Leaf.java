package designpatterns.structural.composite;

public class Leaf implements Component {
    private String name;
    private int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println("name: "+this.name + " price: "+this.price);
    }
}
