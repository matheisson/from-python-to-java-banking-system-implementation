package frompythontojava.exercise3;


import java.util.Currency;

/**
 * Created by levente on 2017.01.05..
 */
public class Withdrawal extends Transaction {

    private Account from;

    public Withdrawal(float amount, Currency currency, Account from) {
        super(amount, currency);
        this.from = from;
    }

    @Override
    protected Receipt completed() throws Cancelled {
        if (this.from.getBalance() >= this.getAmount()) {
            try {
                from.decrease(this.getAmount(), this.getCurrency());
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
        return String.format("Action: %s\nUser: %s\nWithdrew: %s\nBalance: %s",Withdrawal.class.getSimpleName(), from.getAccountNumber(),
                this.getAmount(), from.getBalance());
    }

}
