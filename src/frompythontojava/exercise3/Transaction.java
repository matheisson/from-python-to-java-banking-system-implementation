package frompythontojava.exercise3;

import java.util.Currency;
import java.util.UUID;

/**
 * Created by levente on 2017.01.05..
 */
abstract class Transaction {

    private UUID id;
    private float amount;
    private Currency currency;

    public Transaction(float amount, Currency currency) {
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.currency = currency;
    }

    abstract Receipt completed() throws Cancelled;

    public String toString() {
        return "| ID: " + this.id + ", Amount: " + this.amount + ", Currency: " + this.currency+" | ";
    }

}
