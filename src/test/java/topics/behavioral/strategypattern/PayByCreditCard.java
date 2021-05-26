package topics.behavioral.strategypattern;

public class PayByCreditCard implements PaymentStrategy{
    @Override
    public boolean pay(int paymentAmount) {
        return false;
    }

    @Override
    public void collectPaymentDetails() {

    }
}
