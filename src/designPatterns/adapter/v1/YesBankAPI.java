package designPatterns.adapter.v1;

public class YesBankAPI implements BankAPIInterface {
    @Override
    public int getBalanceInfo() {
        return 1000;
    }

    @Override
    public boolean sendMoney(int amount, String fromUPI, String toUPI) {
        try {
            System.out.println("Transfer successful from " + fromUPI + " to " + toUPI + " of amount: " + amount);
            return true;
        } catch (RuntimeException e) {
            System.out.println("Transfer failed: " + e.getMessage());
            return false;
        }
    }
}
