package topics.structural.facade.accountImpl;

import topics.structural.facade.IAccount;

import java.math.BigDecimal;
import java.util.Random;

public class InvestmentAccount implements IAccount {
    public InvestmentAccount(){
        System.out.println("Investment account...");
    }
    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("successfully deposited amount: "+amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("successfully withdrawn amount: "+amount);
    }

    @Override
    public void transfer(BigDecimal amount) {
        System.out.println("successfully transferred amount: "+amount);
    }
}
