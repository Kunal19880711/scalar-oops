package backAccountSynchronousBlock;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        synchronized (this) {
            balance += amount;
        }
    }

    public void withdrawal(double amount) {
        synchronized (this) {
            balance -= amount;
        }
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
