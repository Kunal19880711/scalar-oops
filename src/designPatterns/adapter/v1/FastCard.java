package designPatterns.adapter.v1;

public class FastCard {
    private final String fastCardUPI = "fastcard@upi";

    public void rechargeCard(BankAPIInterface bankAPIInterface, String userUPI, int amount) {
        if (bankAPIInterface.getBalanceInfo() < amount) {
            throw new RuntimeException("Insufficient balance");
        }
        bankAPIInterface.sendMoney(amount, userUPI, fastCardUPI);
        System.out.println("Recharge successful for " + userUPI + " with amount: " + amount);
    }
}
