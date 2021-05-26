package topics.behavioral.strategypattern;

public interface PaymentStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}


