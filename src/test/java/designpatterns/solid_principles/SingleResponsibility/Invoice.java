package designpatterns.solid_principles.SingleResponsibility;

public class Invoice {
    String customer;
    int total;

    public Invoice(String customer,int total) {
        this.customer = customer;
        this.total = total;
    }

    public String invoiceDetails(){
        return "Customer: "+customer + "\n" + "Total: "+total;
    }

}
