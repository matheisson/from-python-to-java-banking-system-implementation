package frompythontojava.exercise3;

import java.util.Currency;

/**
 * Created by levente on 2017.01.05..
 */
public class Transfer extends Transaction{

    private Account from;
    private Account to;

    public Account getTo() {
        return to;
    }

    public Transfer(float amount, Currency currency, Account from, Account to) {
        super(amount, currency);
        this.from = from;
        this.to = to;
    }

    @Override
    protected Receipt completed() throws Cancelled {
        if (this.from.getBalance() >= this.getAmount() && this.from.getCurrency().equals(this.to.getCurrency())) {
            try {
                this.to.increase(getAmount(), this.getCurrency());
                this.from.decrease(this.getAmount(), this.getCurrency());
                Receipt receipt = new Receipt();
                receipt.addDeatils(this.toString());
                return receipt;
            } catch (InvalidCurrency invalidCurrency) {
                invalidCurrency.printStackTrace();
            }
        }
        throw new Cancelled();
    }

    @Override
    public String toString() {
        return String.format("Action: %s\nFrom: %s\nTo: %s\nAmount: %s %s\nBalance From: %s\nBalance To: %s", Transfer.class.getSimpleName(), from.getAccountNumber(),
                to.getAccountNumber(), this.getAmount(), this.getCurrency(), from.getBalance(), to.getBalance());
    }

    public Account getFrom() {
        return from;
    }
}
