package frompythontojava.exercise3;

import java.util.Currency;

/**
 * Created by levente on 2017.01.05..
 */
public class Deposit extends Transaction {

    private Account to;

    public Deposit(float amount, Currency currency, Account to) {
        super(amount, currency);
        this.to = to;
    }

    @Override
    protected Receipt completed() throws Cancelled {
        if (this.getCurrency().equals(to.getCurrency())) {
            try {
                this.to.increase(this.getAmount(), this.to.getCurrency());
            } catch (InvalidCurrency invalidCurrency) {
                invalidCurrency.printStackTrace();
            }
            Receipt receipt = new Receipt();
            receipt.addDeatils(this.toString());
            return receipt;
        }
        throw new Cancelled();
    }

    @Override
    public String toString() {
        return String.format("Action: %s\nAmount: %s\nTo Account: %s\nBalance now: %s", Deposit.class.getSimpleName(),
                 this.getAmount(), this.to.getAccountNumber(), to.getBalance());
    }
}
