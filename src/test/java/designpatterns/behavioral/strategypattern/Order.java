package designpatterns.behavioral.strategypattern;

public class Order {
    private boolean isClosed;
    private int totalCost;

    public void processOrder(PaymentStrategy strategy){
        strategy.collectPaymentDetails();
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }
}
