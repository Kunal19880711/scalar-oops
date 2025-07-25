package designPatterns.adapter.v2;

public class YesBankAPIAdapter implements BankAPIInterface{
    private final YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int getBalanceInfo() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void sendMoney(int amount, String fromUPI, String toUPI) {
        yesBankAPI.transferAmount(fromUPI, toUPI, amount);
    }
}
