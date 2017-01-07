package frompythontojava.exercise3;

import java.util.Currency;

/**
 * Created by levente on 2017.01.05..
 */
public class Account {

    private User user;
    private String accountNumber;
    private Currency currency;
    private float balance;

    public Account(User user, String accountNumber, Currency currency) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = 0;
    }

    // INCREASE
    public boolean increase(float amount, Currency currency) throws InvalidCurrency{
        if (this.currency != currency){
            throw new InvalidCurrency();
        }
        this.balance += amount;
        return true;
    }

    // DECREASE
    public boolean decrease(float amount, Currency currency) throws InvalidCurrency{
        if (this.currency != currency) {
            throw new InvalidCurrency();
        }
        this.balance -= amount;
        return true;
    }

    public User getUser() {
        return user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public float getBalance() {
        return balance;
    }

    public String toString() {
        return "User: " + this.user.getId() + ", Account Number: " + this.getAccountNumber()+" balance: "+this.getBalance();
    }
}
