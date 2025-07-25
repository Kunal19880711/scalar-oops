package designPatterns.adapter.v0;

public class FastCard {
    private final String fastCardUPI = "fastcard@upi";

    public void rechargeCard(YesBankAPI bankAPI, String userUPI, int amount) {
        if (bankAPI.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }
        bankAPI.transferAmount(userUPI, fastCardUPI, amount);
        System.out.println("Recharge successful for " + userUPI + " with amount: " + amount);
    }
}
