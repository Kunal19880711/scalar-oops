package designPatterns.adapter.v1;

public interface BankAPIInterface {
    int getBalanceInfo();
    boolean sendMoney(int amount, String fromUPI, String toUPI);
}
