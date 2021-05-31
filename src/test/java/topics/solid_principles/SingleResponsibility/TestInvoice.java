package topics.solid_principles.SingleResponsibility;

public class TestInvoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Google",100);
        String invoiceDetails = invoice.invoiceDetails();
        SalesTax salesTax = new SalesTax("AZ");
        Mailer.sendMail(invoiceDetails);
    }
}
