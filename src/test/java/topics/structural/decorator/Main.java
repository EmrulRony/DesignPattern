package topics.structural.decorator;

public class Main {
    public static void main(String[] args) {
        // Order hot chocolate
        MenuItem hotChocolate = new HotChocolate();

        // Get hot chocolate invice
//        System.out.println("Your order: "+hotChocolate.description());
//        System.out.println("Total cost: "+hotChocolate.cost() + "$");

        // add mocha and milk flavor to it
        hotChocolate = new Mocha(hotChocolate);

        // Get hot chocolate invice
        System.out.println("Your order: "+hotChocolate.description());
        System.out.println("Total cost: "+hotChocolate.cost() + "$");
    }
}
