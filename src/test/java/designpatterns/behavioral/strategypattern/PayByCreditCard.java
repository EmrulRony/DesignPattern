package designpatterns.behavioral.strategypattern;

import designpatterns.behavioral.strategypattern.models.CreditCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PaymentStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public boolean pay(int paymentAmount) {
        if (isCardIsPresent()){
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try{
            System.out.println("Enter card number");
            String number = READER.readLine();
            System.out.println("Enter date");
            String date = READER.readLine();
            System.out.println("Enter cvv");
            String cvv = READER.readLine();

            this.card = new CreditCard(number, date, cvv);

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private boolean isCardIsPresent(){
        return card != null;
    }
}
