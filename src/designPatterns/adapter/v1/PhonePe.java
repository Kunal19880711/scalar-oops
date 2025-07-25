package designPatterns.adapter.v1;

public class PhonePe {
    private final BankAPIInterface bankAPIInterface = new ICICIBankAPI();
    private final Loan loan = new Loan();

    public void checkLoanEligibility(String upiId) {
        if(loan.checkEligibility(bankAPIInterface)) {
            System.out.println("User " + upiId + " is eligible for a loan.");
        } else {
            System.out.println("User " + upiId + " is not eligible for a loan.");
        }
    }

    public void rechargeFastCard(String userUPI, int amount) {
        FastCard fastCard = new FastCard();
        try {
            fastCard.rechargeCard(bankAPIInterface, userUPI, amount);
        } catch (RuntimeException e) {
            System.out.println("Recharge failed for " + userUPI + ": " + e.getMessage());
        }
    }
}
