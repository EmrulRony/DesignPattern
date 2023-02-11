package designpatterns.solid_principles.SingleResponsibility;

public class SalesTax {
    String state;

    public SalesTax(String state){
        this.state = state;
    }

    public void printSalesTax(){
        switch (state){
            case "AZ":
                System.out.println("Tax rate: "+5.5);
                break;
            case "TX":
                System.out.println("Tax rate: "+3.2);
                break;
            case "CA":
                System.out.println("Tax rate: "+8.7);
                break;
            default:
                System.out.println("Tax rate: "+5.2);
        }
    }
}
