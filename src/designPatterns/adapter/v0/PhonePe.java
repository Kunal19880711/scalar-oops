package designPatterns.adapter.v0;

public class PhonePe {
    private final YesBankAPI bankAPI = new YesBankAPI();
    private final Loan loan = new Loan();

    public void checkLoanEligibility(String upiId) {
        if(loan.checkEligibility(bankAPI)) {
            System.out.println("User " + upiId + " is eligible for a loan.");
        } else {
            System.out.println("User " + upiId + " is not eligible for a loan.");
        }
    }

    public void rechargeFastCard(String userUPI, int amount) {
        FastCard fastCard = new FastCard();
        try {
            fastCard.rechargeCard(bankAPI, userUPI, amount);
        } catch (RuntimeException e) {
            System.out.println("Recharge failed for " + userUPI + ": " + e.getMessage());
        }
    }
}
