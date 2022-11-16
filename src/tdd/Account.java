package tdd;

public class Account {
    private int balance;

    public void deposit(int amount) {

        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {

        if (amount < balance && amount > 0)
            balance = balance - amount;
        if (balance == amount)
            balance = 0;

    }

}





