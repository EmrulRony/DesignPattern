package designpatterns.behavioral.chainOfResponsiblility.model;

public class Numbers {
    private int number_1;
    private int number_2;

    private String calculationMethod;

    public Numbers(int number_1, int number_2, String calculationMethod) {
        this.number_1 = number_1;
        this.number_2 = number_2;
        this.calculationMethod = calculationMethod;
    }

    public int getNumber_1() {
        return number_1;
    }

    public int getNumber_2() {
        return number_2;
    }

    public String getCalculationMethod() {
        return calculationMethod;
    }
}
