package designpatterns.behavioral.strategypattern;

public interface PaymentStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}


