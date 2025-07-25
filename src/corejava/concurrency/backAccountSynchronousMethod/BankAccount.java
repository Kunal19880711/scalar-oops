package corejava.concurrency.backAccountSynchronousMethod;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    synchronized public void deposit(double amount) {
        balance += amount;
    }

    synchronized public void withdrawal(double amount) {
        balance -= amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
