package lesson66.task1.megabankcorp.system;

import lesson66.task1.megabankcorp.records.*;

import java.math.BigDecimal;

public abstract class Database {
    public abstract void deposit(BigDecimal sum, Account num);

    public abstract void withdraw(BigDecimal sum, Account num);

    protected abstract BigDecimal getAmount(Account num);

    void transfer(Account num, Account num2, BigDecimal sum) {
        withdraw(sum, num);
        deposit(sum, num2);
    }
}


