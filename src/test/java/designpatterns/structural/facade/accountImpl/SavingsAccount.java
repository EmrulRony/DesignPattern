package designpatterns.structural.facade.accountImpl;

import designpatterns.structural.facade.IAccount;

import java.math.BigDecimal;

public class SavingsAccount implements IAccount {
    public SavingsAccount(){
        System.out.println("Savings account...");
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
