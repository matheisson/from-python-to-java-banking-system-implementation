package frompythontojava.exercise3;


import java.util.Currency;

/**
 * Created by levente on 2017.01.05..
 */
public class Withdrawal extends Transaction {

    public Withdrawal(float amount, Currency currency) {
        super(amount, currency);
    }

    @Override
    Receipt completed() throws Cancelled {
        return null;
    }

}
