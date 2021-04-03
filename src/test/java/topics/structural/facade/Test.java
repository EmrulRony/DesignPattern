package topics.structural.facade;

import java.math.BigDecimal;

public class Test {
    @org.junit.Test
    public void testFacadeDesignPattern(){
        BankService bankService = new BankService();
        bankService.getBankService(BankService.AccountType.CREDITCARD, BankService.ServiceType.DEPOSIT, new BigDecimal(50000));
        bankService.getBankService(BankService.AccountType.SAVINGS, BankService.ServiceType.TRANSFER, new BigDecimal(50000));

    }
}
