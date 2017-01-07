package frompythontojava.exercise3;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by levente on 2017.01.06..
 */
public class Main {
    public static void main(String[] args) throws InvalidCurrency, Cancelled {
        Currency gbp = Currency.getInstance(Locale.UK);
        Currency usd = Currency.getInstance(Locale.US);

        User u1 = new User();
        Account acc1 = new Account(u1,"123",gbp);
        acc1.increase(10000,gbp);
        User u2 = new User();
        Account acc2 = new Account(u2,"123123",gbp);

        System.out.println("\nExample for Transaction:");
        Transaction t = new Transfer(50,gbp,acc1,acc2);
        System.out.println(t.completed());

        System.out.println("Example for withdrawal");
        Withdrawal w = new Withdrawal(123,gbp,acc1);
        System.out.println(w.completed());

        System.out.println("Example for Deposit");
        Deposit d = new Deposit(1230,gbp,acc1);
        System.out.println(d.completed());




//        System.out.println("THESE SHALL THROW EXCEPTIONS\n");

//        Transaction failedT = new Transfer(1000000000,gbp,acc1,acc2);
//        System.out.println(failedT.completed());

//        Transaction failedT2 = new Transfer(1000,usd,acc1,acc2);
//        System.out.println(failedT2.completed());

//        Deposit failedD = new Deposit(123,usd,acc2);
//        System.out.println(failedD.completed());

        // If currency is different
//        Withdrawal failedW = new Withdrawal(100, usd, acc1);
//        System.out.println(failedW.completed());

//        // If withdrawal too big
//        Withdrawal failedW = new Withdrawal(1000000, gbp, acc1);
//        System.out.println(failedW.completed());

    }
}
