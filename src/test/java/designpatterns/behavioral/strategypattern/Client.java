package designpatterns.behavioral.strategypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    private static HashMap<Integer,Integer> itemProductMap = new HashMap<>();
    private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PaymentStrategy strategy;

    static {
        itemProductMap.put(1, 2200);
        itemProductMap.put(2, 1850);
        itemProductMap.put(3, 1100);
        itemProductMap.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()){
            boolean iWantToContinueShopping = false;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(READER.readLine());
                int cost = itemProductMap.get(choice);
                System.out.println("Please enter the quantity of the product");
                int qty = Integer.parseInt(READER.readLine());
                order.setTotalCost(cost * qty);
                System.out.println("Do you want to continue selecting products? Y/N");
                String iWantToContinueShoppingStr = READER.readLine();
                iWantToContinueShopping = iWantToContinueShoppingStr.
                        equalsIgnoreCase("Y")?
                        true:false;
            } while (iWantToContinueShopping);

            if (strategy == null){
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                int paymentMethod = Integer.parseInt(READER.readLine());
                if (paymentMethod == 1){
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            order.processOrder(strategy);
            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = READER.readLine();
            if (proceed.equalsIgnoreCase("P")){
                if (strategy.pay(order.getTotalCost())){
                    System.out.println("Payment successful");
                } else {
                    System.out.println("Faild payment");
                }
                order.setClosed();
            }
        }
    }
}
