package designpatterns.structural.facade;

import java.math.BigDecimal;

public interface IAccount {
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(BigDecimal amount);
}
