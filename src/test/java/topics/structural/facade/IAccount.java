package topics.structural.facade;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface IAccount {
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(BigDecimal amount);
}
