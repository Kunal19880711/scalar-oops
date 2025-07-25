package designPatterns.adapter.v2;

public interface BankAPIInterface {
    int getBalanceInfo();
    void sendMoney(int amount, String fromUPI, String toUPI);
}
