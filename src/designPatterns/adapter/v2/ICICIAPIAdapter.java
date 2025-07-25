package designPatterns.adapter.v2;

public class ICICIAPIAdapter implements BankAPIInterface{

    private final ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public int getBalanceInfo() {
        return iciciBankAPI.fetchBalance();
    }

    @Override
    public void sendMoney(int amount, String fromUPI, String toUPI) {
        iciciBankAPI.verifyAndAddDestinationUPI(toUPI);
        try {
            iciciBankAPI.makeTransfer(fromUPI, amount);
        } catch (RuntimeException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}
