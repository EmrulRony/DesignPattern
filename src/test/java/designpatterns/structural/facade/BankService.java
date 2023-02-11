package designpatterns.structural.facade;

import designpatterns.structural.facade.accountImpl.CreditCardAccount;
import designpatterns.structural.facade.accountImpl.InvestmentAccount;
import designpatterns.structural.facade.accountImpl.SavingsAccount;

import java.math.BigDecimal;

public class BankService {
    IAccount account = null;
    public void getBankService(AccountType accountType, ServiceType serviceType, BigDecimal amount){
        switch (accountType){
            case SAVINGS:
                account = new SavingsAccount();
                getAccountService(serviceType,amount);
                break;
            case INVESTMENT:
                account = new InvestmentAccount();
                getAccountService(serviceType,amount);
                break;
            case CREDITCARD:
                account = new CreditCardAccount();
                getAccountService(serviceType,amount);
                break;
            default:
                System.out.println("Please select the type of the account");
        }
    };

    private void getAccountService(ServiceType serviceType,BigDecimal amount){
        switch (serviceType){
            case DEPOSIT:
                account.deposit(amount);
                break;
            case WITHDRAW:
                account.withdraw(amount);
                break;
            case TRANSFER:
                account.transfer(amount);
                break;
            default:
                System.out.println("No service selected");
        }

    }

    public enum AccountType{
        SAVINGS,CREDITCARD,INVESTMENT;
    }
    public enum ServiceType{
        DEPOSIT,WITHDRAW,TRANSFER;
    }
}
